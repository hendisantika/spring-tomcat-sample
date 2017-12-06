package com.hendisantika.springtomcatsample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-tomcat-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/12/17
 * Time: 06.22
 * To change this template use File | Settings | File Templates.
 */

@Configuration
public class DBConfiguration {
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .generateUniqueName(false)
                .setName("testdb")
                .setType(EmbeddedDatabaseType.H2)
                .addDefaultScripts()
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .build();
    }

    @Bean
    public NamedParameterJdbcTemplate namedParamJdbcTemplate() {
        NamedParameterJdbcTemplate namedParamJdbcTemplate =
                new NamedParameterJdbcTemplate(dataSource());
        return namedParamJdbcTemplate;
    }
}

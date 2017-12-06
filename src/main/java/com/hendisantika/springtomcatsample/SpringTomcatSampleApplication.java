package com.hendisantika.springtomcatsample;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.hendisantika.springtomcatsample")
public class SpringTomcatSampleApplication extends AnnotationConfigWebApplicationContext {

//	public static void main(String[] args) {
//		SpringApplication.run(SpringTomcatSampleApplication.class, args);
//	}
}

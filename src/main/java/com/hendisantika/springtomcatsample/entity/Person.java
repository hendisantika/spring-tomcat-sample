package com.hendisantika.springtomcatsample.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-tomcat-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/12/17
 * Time: 06.21
 * To change this template use File | Settings | File Templates.
 */

@Data
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String placeOfBirth;
}

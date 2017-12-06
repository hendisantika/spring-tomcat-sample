package com.hendisantika.springtomcatsample.controller;

import com.hendisantika.springtomcatsample.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-tomcat-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/12/17
 * Time: 06.29
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/persons")
public class ApiController {
    @Autowired
    PersonDAO personDao;

    @GetMapping
    public ResponseEntity<?> getPersons(){
        return ResponseEntity.ok(personDao.getPersons());
    }
}

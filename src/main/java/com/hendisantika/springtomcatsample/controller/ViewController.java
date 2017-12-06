package com.hendisantika.springtomcatsample.controller;

import com.hendisantika.springtomcatsample.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-tomcat-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/12/17
 * Time: 06.28
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class ViewController {
    @Autowired
    PersonDAO personDao;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("persons", personDao.getPersons());
        return "index";
    }
}

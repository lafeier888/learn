package com.lafeier.controller;

import com.lafeier.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Helloworld {

    @Autowired
    Person person;

    @RequestMapping("/helloworld")
    @ResponseBody
    public Person hello(){
        return person;
    }
}

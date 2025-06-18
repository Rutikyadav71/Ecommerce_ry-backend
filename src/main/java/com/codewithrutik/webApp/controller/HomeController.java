package com.codewithrutik.webApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "welcome to rutik world !!!";
    }
    @RequestMapping("/about")
    public String about(){
        return "welcome to about !!!";
    }
}

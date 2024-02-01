package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@ResponseBody

public class RequestParameter {
 @RequestMapping("/hello")
 public String hello
    (@RequestParam ( name = "firstName") String firstName,
    @RequestParam (name = "location") String location
    ) {
    
        return "Welcome to the " + location + " " + firstName;
 }
}
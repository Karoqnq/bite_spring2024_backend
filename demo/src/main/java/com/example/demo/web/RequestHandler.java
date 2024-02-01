package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@ResponseBody
public class RequestHandler {

    @GetMapping("/index")
    public String getIndex() {
        return "This is the main page";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "This is the contact page";
    }
}

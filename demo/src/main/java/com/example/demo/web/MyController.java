package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/main")

    public String showMessage(@RequestParam(name = "name") String name,
            Model model) {

        model.addAttribute("name2", name);
        // do something
        return "hello";
    }

}

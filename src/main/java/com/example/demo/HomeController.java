package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    @RequestMapping("/2")
    public String secondPage(){
        return "page2";
    }

    @RequestMapping("/3")
    public String thirdPage(){
        return "page3";
    }

}

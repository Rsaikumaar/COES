package com.saikumar.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hi kalyani";
    }

    @RequestMapping("/hello1")
    public String Lock(){
        return "Hi abishak";
    }
}

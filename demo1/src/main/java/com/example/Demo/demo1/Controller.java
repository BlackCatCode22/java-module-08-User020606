package com.example.Demo.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/greet")
    public String greet() {
        return "Hello World";
    }

}

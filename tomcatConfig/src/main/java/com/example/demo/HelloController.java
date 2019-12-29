package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Eric
 * @Date 2019/12/29
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello SpringBoot!";
    }
}

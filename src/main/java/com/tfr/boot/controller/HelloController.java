package com.tfr.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: rain
 * @date: Created in 2020/12/29 19:34
 * @version: 1.0
 * @modified By:
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping
    public void hah(String name){
        System.out.println("eklfhikewh");
    }
}

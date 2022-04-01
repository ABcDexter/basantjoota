package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public  Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name) );
    }

    // @RequestMapping(RequestMethod.)
    /*
    TODO : learn these
    @DeleteMapping
    @PostMapping
    @PutMapping
    */

    // TODO Learn CRUD operation with DB

    // TODO Learn Interceptor

    // TODO Login: JWT, SSO

}

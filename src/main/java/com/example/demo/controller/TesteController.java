package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TesteService;

@RestController
@RequestMapping("/hello")
public class TesteController {

    private final TesteService service;

    

    public TesteController(TesteService service) {
        this.service = service;
    }



    public String helloWord() {
        return service.helloWord();
    }
}

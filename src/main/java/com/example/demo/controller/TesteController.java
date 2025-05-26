package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    public String helloWord() {
        return "Teste PipeLine";
    }
}

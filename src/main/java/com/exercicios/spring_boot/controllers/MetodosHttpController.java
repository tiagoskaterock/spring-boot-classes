package com.exercicios.spring_boot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get() {
        return "GET Request";
    }

    @PostMapping
    public String post() {
        return "POST Request";
    }

    @PutMapping
    public String put() {
        return "PUT Request";
    }

    @PatchMapping
    public String patch() {
        return "PATCH Request";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE Request";
    }

}

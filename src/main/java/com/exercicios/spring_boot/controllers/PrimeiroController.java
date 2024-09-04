package com.exercicios.spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping(method = RequestMethod.GET, path = "/ola")
    public String ola() {
        return "<h1>Olá Spring Boot!</h1>";
    }

    @GetMapping
    public String hello() {
        return "<h1>Hello</h1>";
    }

    @GetMapping(path = "helloBananas")
    public String helloBananas() {
        return "<h1>Hello Bananas!</h1>";
    }

    @GetMapping(path = {"/metallica", "/megadeth", "/slayer", "/sepultura", "kreator"})
    public String bands() {
        return "<h1>Metallica, Megadeth, Slayer, Kreator, Sepultura!</h1>";
    }
}

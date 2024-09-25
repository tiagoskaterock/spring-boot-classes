package com.exercicios.spring_boot.controllers;

import com.exercicios.spring_boot.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789.00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "908.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
        return new Cliente(id, "João", "111.222.333-44");
    }
}

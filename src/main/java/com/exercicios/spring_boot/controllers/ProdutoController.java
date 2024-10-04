package com.exercicios.spring_boot.controllers;

import com.exercicios.spring_boot.model.entities.Produto;
import com.exercicios.spring_boot.model.entities.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto novoProduto(@Valid @ModelAttribute Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}

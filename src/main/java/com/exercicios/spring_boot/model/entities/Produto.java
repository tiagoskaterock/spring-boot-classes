package com.exercicios.spring_boot.model.entities;

import com.exercicios.spring_boot.model.entities.repositories.ProdutoRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Autowired
    @Transient
    public ProdutoRepository repository;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

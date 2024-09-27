package com.exercicios.spring_boot.model.entities.repositories;

import com.exercicios.spring_boot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {



}

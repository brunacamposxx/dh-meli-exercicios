package com.example.spring02.controller;

import com.example.spring02.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<>();

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable int id) {
        Produto p = produtos.get(id-1);
        return p;
    }

    public ProdutoController() {
        produtos.add(new Produto(1, "Produto 1", 10));
        produtos.add(new Produto(2, "Produto 2", 20));
        produtos.add(new Produto(3, "Produto 3", 30));
    }

}

package com.example.spring02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private int id;
    private String nome;
    private double valor;

}

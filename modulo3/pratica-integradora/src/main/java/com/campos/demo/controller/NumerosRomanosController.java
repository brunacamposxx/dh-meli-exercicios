package com.campos.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    @GetMapping("/{id}")
    public String numerosRomanos(@PathVariable String id) {
        if (id.equals("1")) {
            return "|";
        } else if (id.equals("2")) {
            return "||";
        } else if (id.equals("3")) {
            return "|||";
        } else if (id.equals("4")) {
            return "IV";
        } else if (id.equals("5")) {
            return "V";
        } else if (id.equals("6")) {
            return "VI";
        } else if (id.equals("7")) {
            return "VII";
        } else if (id.equals("8")) {
            return "VIII";
        } else if (id.equals("9")) {
            return "IX";
        } else if (id.equals("10")) {
            return "X";
        } else {
            return " @_@ ";
        }

    }


}

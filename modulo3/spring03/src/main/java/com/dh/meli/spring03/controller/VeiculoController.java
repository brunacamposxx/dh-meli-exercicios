package com.dh.meli.spring03.controller;

import com.dh.meli.spring03.exception.VeiculoNotFoundException;
import com.dh.meli.spring03.model.Veiculo;
import com.dh.meli.spring03.service.IVeiculo;
import com.dh.meli.spring03.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private IVeiculo service;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) {
        Veiculo veiculo = null;
        try {
            veiculo = service.getVeiculo(placa);
            return new ResponseEntity<>(veiculo, HttpStatus.OK);
        } catch (VeiculoNotFoundException e) {
            return new ResponseEntity<>(veiculo, HttpStatus.NOT_FOUND);
        }
    }
}

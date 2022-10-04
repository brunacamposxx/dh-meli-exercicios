package com.dh.meli.spring03.service;

import com.dh.meli.spring03.exception.VeiculoNotFoundException;
import com.dh.meli.spring03.model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa) throws VeiculoNotFoundException;
    List<Veiculo> getAllVeiculo();
}

package com.dh.meli.spring03.service;

import com.dh.meli.spring03.exception.VeiculoNotFoundException;
import com.dh.meli.spring03.model.Veiculo;
import com.dh.meli.spring03.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepo repo;

    @Override
    public Veiculo getVeiculo(String placa) throws VeiculoNotFoundException {
        Optional<Veiculo> veiculo = repo.getVeiculo(placa);
        if (veiculo.isEmpty()) {
            throw new VeiculoNotFoundException("Veiculo not found");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return null;
    }
}

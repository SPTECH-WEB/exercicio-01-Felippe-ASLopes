package com.test.service;

import com.test.model.Fatura;
import com.test.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    @Autowired
    private FaturaRepository faturaRepository;

    public Fatura salvar(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public List<Fatura> listarTodos() {
        return faturaRepository.findAll();
    }
}

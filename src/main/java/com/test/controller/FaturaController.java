package com.test.controller;

import com.test.service.FaturaService;
import com.test.model.Fatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    @Autowired
    private FaturaService faturaService;

    @PostMapping
    public ResponseEntity<String> criarFatura(@RequestBody Fatura fatura) {
        faturaService.salvar(fatura);
        return ResponseEntity.created(null).body("Fatura cadastrada com sucesso.");
    }

    @GetMapping
    public ResponseEntity<List<Fatura>> listarFaturas() {
        List<Fatura> listaFaturas = faturaService.listarTodos();
        return listaFaturas.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(listaFaturas);
    }
}

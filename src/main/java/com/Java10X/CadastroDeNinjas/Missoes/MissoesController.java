package com.Java10X.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @PostMapping("/adicionar-missoes")
    public String adicionarMissoes() {
        return "Missão adicionada com sucesso";
    }

    @GetMapping("/buscar-missoes")
    public String buscarMissoes() {
        return "Missão adicionada com sucesso";
    }

    @GetMapping("/buscar-missoes/{id}")
    public String buscarMissoesPorId(String id) {
        return "Missão encontrada com sucesso: " + id;
    }

    @PutMapping("/alterar-missoes/{id}")
    public void alterarMissoes(String id) {
        
    }

    @DeleteMapping("/deletar-missoes/{id}")
    public void deletarMissoes(String id) {
        
    }
}

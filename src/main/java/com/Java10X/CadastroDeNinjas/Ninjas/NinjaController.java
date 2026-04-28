package com.Java10X.CadastroDeNinjas.Ninjas;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService _ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this._ninjaService = ninjaService;
    }

    @GetMapping("/buscar-ninja")
    public List<NinjaModel> buscarNinja() {
        return _ninjaService.listarNinjas();
    }

    @GetMapping("/buscar-ninja/{id}")
    public String buscarNinjaPorId(String id) {
        return "Ninja encontrado com sucesso: " + id;
    }

    @PostMapping("/adicionar-ninja")
    public String criarNinja() {
        return "Ninja criado com sucesso";
    }

    @PutMapping("alterar-ninja/{id}")
    public void alterarNinja(String id) {
        
    }

    @DeleteMapping("/deletar-ninja/{id}")
    public void deletarNinja(String id) {}
}

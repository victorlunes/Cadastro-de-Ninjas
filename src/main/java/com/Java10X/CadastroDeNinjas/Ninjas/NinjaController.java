package com.Java10X.CadastroDeNinjas.Ninjas;

import java.util.List;

import org.springframework.web.bind.annotation.*;

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
    public NinjaModel buscarNinjaPorId(@PathVariable int id) {
        return _ninjaService.bucarNinjaId(id);
    }

    @PostMapping("/adicionar-ninja")
    public String criarNinja() {
        return "Ninja criado com sucesso";
    }

    @PutMapping("alterar-ninja/{id}")
    public void alterarNinja(String id) {
        
    }
}

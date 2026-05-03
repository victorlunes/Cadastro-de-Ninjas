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
    public void criarNinja(@RequestBody NinjaModel ninja) {
        _ninjaService.criarNinja(ninja);
    }

    @PutMapping("alterar-ninja")
    public NinjaModel alterarNinja(@RequestBody NinjaModel ninja) {
        return _ninjaService.atualizarNinja(ninja);
    }

    @DeleteMapping("deletar-ninja/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        _ninjaService.deletarNinjaPorId(id);
    }
}

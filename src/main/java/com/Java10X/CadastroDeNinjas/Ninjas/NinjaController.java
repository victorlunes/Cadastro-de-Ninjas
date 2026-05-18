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
    public List<NinjaDTO> buscarNinja() {
        return _ninjaService.listarNinjas();
    }

    @GetMapping("/buscar-ninja/{id}")
    public NinjaDTO buscarNinjaPorId(@PathVariable Long id) {
        return _ninjaService.bucarNinjaId(id);
    }

    @PostMapping("/adicionar-ninja")
    public void criarNinja(@RequestBody NinjaDTO ninjaDTO) {
        _ninjaService.criarNinja(ninjaDTO);
    }

    @PutMapping("alterar-ninja/{id}")
    public NinjaDTO alterarNinja(@RequestBody NinjaDTO ninja, @PathVariable Long id) {
        return _ninjaService.atualizarNinja(ninja, id);
    }

    @DeleteMapping("deletar-ninja/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        _ninjaService.deletarNinjaPorId(id);
    }
}

package com.Java10X.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    private NinjaRepository _ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this._ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return _ninjaRepository.findAll();
    }

    public NinjaModel bucarNinjaId(long id){
        Optional<NinjaModel> ninja = _ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public void criarNinja(NinjaModel ninja) {
        _ninjaRepository.save(ninja);
    }
}

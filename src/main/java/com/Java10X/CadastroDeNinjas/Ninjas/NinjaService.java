package com.Java10X.CadastroDeNinjas.Ninjas;

import java.util.List;

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

}

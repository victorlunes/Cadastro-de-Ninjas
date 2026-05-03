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

    public void deletarNinjaPorId(long id){
        _ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(NinjaModel ninja){
        NinjaModel ninjaExiste = bucarNinjaId(ninja.getId());

        if(ninjaExiste == null) {
            return null;
        }

        ninjaExiste.setNome(ninja.getNome());
        ninjaExiste.setEmail(ninja.getEmail());
        ninjaExiste.setIdade(ninja.getIdade());
        ninjaExiste.setRank(ninja.getRank());
        ninjaExiste.setImgUrl(ninja.getImgUrl());
        ninjaExiste.setMissoes(ninja.getMissoes());

        _ninjaRepository.save(ninjaExiste);
        return ninjaExiste;
    }
}

package com.Java10X.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    private NinjaRepository _ninjaRepository;
    private NinjaMapper _ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this._ninjaRepository = ninjaRepository;
        this._ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = _ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninja -> _ninjaMapper.map(ninja))
                .toList();
    }

    public NinjaDTO bucarNinjaId(long id){
        Optional<NinjaModel> ninjaPorId = _ninjaRepository.findById(id);
        return ninjaPorId.map(ninja -> _ninjaMapper.map(ninja)).orElse(null);
    }

    public void criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = _ninjaMapper.map(ninjaDTO);
        _ninjaRepository.save(ninja);
    }

    public void deletarNinjaPorId(long id){
        _ninjaRepository.deleteById(id);
    }

    public NinjaDTO atualizarNinja(NinjaDTO ninjaDTO, Long id){
        Optional<NinjaModel> ninjaExistente = _ninjaRepository.findById(id);

        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = _ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);

            NinjaModel ninjaSalvo = _ninjaRepository.save(ninjaAtualizado);

            return _ninjaMapper.map(ninjaSalvo);
        }

        return null;
    }
}

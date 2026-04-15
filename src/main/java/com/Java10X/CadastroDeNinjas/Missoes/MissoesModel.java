package com.Java10X.CadastroDeNinjas.Missoes;

import java.util.List;

import com.Java10X.CadastroDeNinjas.Ninjas.NinjaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String nomeHokageAtribuiu;

    //@OneToMany Uma missão pode ter varios ninjas
    @OneToMany(mappedBy= "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel() {}

    public MissoesModel(String nomeMissoes, String dificuldade){
        this.nome = nomeMissoes;
        this.dificuldade = dificuldade;
    }

    public String getNomeMissoes() {
        return this.nome;
    }

    public String getDificuldade() {
        return this.dificuldade;
    }

    public String getNomeHokageAtribuiu() {
        return this.nomeHokageAtribuiu;
    }

    public List<NinjaModel> getNinja() {
        return this.ninja;
    }

    public void setNomeMissoes(String nomeMissoes) {
        this.nome = nomeMissoes;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setNomeHokageAtribuiu(String nomeHokage){
        this.nomeHokageAtribuiu = nomeHokage;
    }

    public void setNinja(List<NinjaModel> ninja){
        this.ninja = ninja;
    }

}

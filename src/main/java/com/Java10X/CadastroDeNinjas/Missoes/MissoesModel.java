package com.Java10X.CadastroDeNinjas.Missoes;

import java.util.List;

import com.Java10X.CadastroDeNinjas.Ninjas.NinjaModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String nomeHokageAtribuiu;

    //@OneToMany Uma missão pode ter varios ninjas
    @OneToMany(mappedBy= "missoes")
    @JsonIgnore
    private List<NinjaModel> ninja;
}

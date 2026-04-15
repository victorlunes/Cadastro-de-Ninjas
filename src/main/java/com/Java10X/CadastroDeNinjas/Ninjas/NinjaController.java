package com.Java10X.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}

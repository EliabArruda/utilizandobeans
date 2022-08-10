package com.digitalinnovationone.utilizandobeans.model;

import com.digitalinnovationone.utilizandobeans.config.AutorLivro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor implements AutorLivro {

    private String nome;

    @Override
    public void exibir(){
        System.out.println("Autor:" + nome);
    }

}

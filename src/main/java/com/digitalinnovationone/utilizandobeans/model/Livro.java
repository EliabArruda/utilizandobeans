package com.digitalinnovationone.utilizandobeans.model;

import com.digitalinnovationone.utilizandobeans.config.AutorLivro;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Livro implements AutorLivro {


    private String nome;
    private String codigo;

    @Autowired
    private AutorLivro autor;

    public Livro(){


    }


    @Override
    public void exibir(){
        System.out.println("Livro: " + nome);
        autor.exibir();
        System.out.println("Código: " + codigo);
    }
}

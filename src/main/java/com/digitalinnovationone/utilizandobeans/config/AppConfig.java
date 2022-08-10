package com.digitalinnovationone.utilizandobeans.config;

import com.digitalinnovationone.utilizandobeans.model.Autor;
import com.digitalinnovationone.utilizandobeans.model.Livro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }
    //<bean id="livro" class="com.springframework.Livro" />

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}

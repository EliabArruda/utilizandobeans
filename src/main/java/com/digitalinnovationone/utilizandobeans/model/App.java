package com.digitalinnovationone.utilizandobeans.model;

import com.digitalinnovationone.utilizandobeans.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);


        autor.setNome("Jonathan Edwards");
        livro.setNome("Pecadores nas mãos de um Deus Irado");
        livro.setCodigo("D485K");

        livro.exibir();

        ((AbstractApplicationContext)factory).close();

    }
}

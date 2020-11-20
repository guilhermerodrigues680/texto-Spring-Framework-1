package com.example.somentespring;

import org.springframework.stereotype.Component;

@Component
public class MeuComponente {

    private Pessoa pessoa;

    public MeuComponente() {
        pessoa = new Pessoa("Joao", 23);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}

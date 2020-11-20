package com.example.somentespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MeuComponente2 {

    @Autowired
    MeuComponente meuComponente;

    public Pessoa getPessoa2() {
        return meuComponente.getPessoa();
    }

}

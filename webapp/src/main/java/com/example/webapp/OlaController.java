package com.example.webapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class OlaController {

    // http://localhost:8080/ola
    @GetMapping("/ola")
    public String olaGET() {
        return "Ola usuario!";
    }

    // http://localhost:8080/ola-pessoa
    @GetMapping(value = "/ola-pessoa", produces = "application/json")
    public Pessoa olaPessoaGET() {
        Pessoa pessoa = new Pessoa("Joao", 21);
        return pessoa;
    }

    // http://localhost:8080/ola2?nome=Maria
    @GetMapping("/ola2")
    public String ola2GET(@RequestParam(required = false, defaultValue = "usuario") String nome) {
        return "Ola " + nome;
    }

    // http://localhost:8080/ola-pessoa/xml
    @GetMapping(value = "/ola-pessoa/xml", produces = "application/xml")
    public Pessoa olaPessoaXmlGET() {
        Pessoa pessoa = new Pessoa("Joao", 21);
        return pessoa;
    }

}

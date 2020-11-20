package com.example.webapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Pessoa {

    private String nome;
    private int idade;

}

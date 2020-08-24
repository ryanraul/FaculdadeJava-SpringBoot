package com.aula.aula02.controle;

import java.util.Scanner;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Uma classe e formada por metodos e atributos
//Metodos --> "Funcoes"
//Atributos --> "Variaveis"

//Anotacao java, tal anotacao determina que a classe MeuControle sera uma controladora ira lidar com requisicoes http
@RestController
public class MeuControle {
    Scanner sc = new Scanner(System.in);
    public String nome;
    //Somente nomes de classes comecao com MAIUSCULA
    @GetMapping("/hello") //Quando ".../hello" for chamado sera executado o metodo
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/nome")
    public String Pegarnome(){
        nome = sc.nextLine();
        return(nome);
    }


}
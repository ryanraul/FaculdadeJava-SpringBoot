package com.example.cursorestfulspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/cliente")
    public String getCliente(){
        return("Id: 1\nNome: Raul\nSobrenome: Ryan");
    }

    @GetMapping("/cliente/{id}")
    public String getClienteById(@PathVariable int id){
        return("Id: 1\nNome: Ryan\nSobrenome: Raul");
    }
}
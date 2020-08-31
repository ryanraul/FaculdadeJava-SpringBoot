package com.example.cursorestfulspringboot.controllers;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.cursorestfulspringboot.models.Cliente;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.server.Client;

@RestController
public class ClienteController {
    
    public List<Cliente> clientes;

    @PostConstruct
    public void init(){
        Cliente c1 = new Cliente(1,"Raul","Rua tal 1",200.4);
        Cliente c2 = new Cliente(2,"Ryan","Rua tal 2",500.3);
        Cliente c3 = new Cliente(3,"Deaque","Rua tal 3",300);

        // Cliente c1 = new Cliente();
        // c1.id = 1;
        // c1.nome = "Raul";
        // c1.endereco = "Rua tal, 99";
        // c1.saldo = 250.0;

        // Cliente c2 = new Cliente();
        // c2.id = 1;
        // c2.nome = "Deaque";
        // c2.endereco = "Rua tal, 42";
        // c2.saldo = 300.0;

        // Cliente c3 = new Cliente();
        // c3.id = 1;
        // c3.nome = "Ryan";
        // c3.endereco = "Rua tal, 1029";
        // c3.saldo = 125.4;

        clientes = Arrays.asList(c1,c2,c3);
    }


    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return(clientes);
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable int id){
        Cliente cliente = null;

        for(Cliente aux : clientes){
            if( aux.id == id){
                cliente = aux;
                break;
            }
        }

        return cliente;
        
        //Outra possibilidade
        //RETORNO DO METODO : ResponseEntity<Cliente>
        // for(int i = 0;i<clientes.size();i++){
        //     if(clientes.get(i).id == id){
        //         return new ResponseEntity<>(clientes.get(i),HttpStatus.OK);
        //     }
        // }
        // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
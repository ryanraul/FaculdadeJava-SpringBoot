package com.example.cursorestfulspringboot.controllers;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.cursorestfulspringboot.models.Cliente;
import com.example.cursorestfulspringboot.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository repository;


    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return repository.getAllClientes();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable int id){
        return repository.getClienteById(id);
    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public Cliente removeCliente(@PathVariable int id){
        return repository.remove(id);
    }

    @PutMapping("/cliente/{id}")
    public Cliente changeCliente(@RequestBody Cliente cliente,@PathVariable int id){
        return repository.edit(cliente,id);
    }
}
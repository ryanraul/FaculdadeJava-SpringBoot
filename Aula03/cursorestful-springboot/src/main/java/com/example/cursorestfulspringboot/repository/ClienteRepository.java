package com.example.cursorestfulspringboot.repository;


import java.util.List;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import com.example.cursorestfulspringboot.models.Cliente;

import org.springframework.stereotype.Component;


@Component
public class ClienteRepository {
    
    public List<Cliente> clientes;

    @PostConstruct
    public void init(){
        // Cliente c1 = new Cliente(1,"Raul","Rua tal 1",200.4);
        // Cliente c2 = new Cliente(2,"Ryan","Rua tal 2",500.3);
        // Cliente c3 = new Cliente(3,"Deaque","Rua tal 3",300);

        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Raul");
        c1.setEndereco("Rua tal, 98");
        c1.setSaldo(250.0);

        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Ryan");
        c2.setEndereco("Rua tal 2, 123");
        c2.setSaldo(325.0);

        Cliente c3 = new Cliente();
        c3.setId(3);
        c3.setNome("Deaque");
        c3.setEndereco("Rua tal 3, 111");
        c3.setSaldo(325.0);

        
        clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
    }

    public List<Cliente> getAllClientes(){
        return(clientes);
    }

    public Cliente getClienteById(int id){
        for(Cliente aux : clientes){
            if( aux.getId() == id){
                return aux;
            }
        }

        return null;
    }

    public Cliente save(Cliente cliente){
        cliente.setId(clientes.size() + 1);
        clientes.add(cliente);
        return cliente;
    }

    public Cliente remove(int id){
        for(Cliente aux : clientes){
            if( aux.getId() == id){
                clientes.remove(aux);
                return aux;
            }
        }
        return null;
    }

    public Cliente edit(Cliente cliente, int id){
        for(Cliente aux : clientes){
            if( aux.getId() == id){
                aux = cliente;
                aux.setId(id);
                clientes.set(id-1, aux);
                return aux;
            }
        }
        return null;
    }
}
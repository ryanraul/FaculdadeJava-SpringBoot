package com.example.cursorestfulspringboot.models;

public class Cliente {
    public int id;
    public String nome;
    public String endereco;
    public double saldo;

    public Cliente(int id,String nome, String endereco, double saldo){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.saldo = saldo;
    }
}
package com.example.cursorestfulspringboot.models;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private double saldo;

	public Cliente(){
		
	}
    public Cliente(int id,String nome, String endereco, double saldo){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.saldo = saldo;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
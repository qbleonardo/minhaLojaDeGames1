package com.minhaLojaDeGames1.minhaLojaDeGames1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_pessoa")
public class Usuario {
	
	@Id
	@GeneratedValue  (strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotNull
	@Size(min = 2, max = 200)
	private String nome;
	
	@NotNull
	private int dataDeNascimento;
	
	@NotNull
	private double creditoPromocional;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getCreditoPromocional() {
		return creditoPromocional;
	}

	public void setCreditoPromocional(double creditoPromocional) {
		this.creditoPromocional = creditoPromocional;
	}
	
	
}

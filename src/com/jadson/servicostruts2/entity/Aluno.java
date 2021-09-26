package com.jadson.servicostruts2.entity;

import java.util.List;

public class Aluno {
	
	private Long id; private String nome;

  private int idade; private String email;

	  private List disciplinas;

	 

	  public Aluno(Long id, String nome, int idade, 
	      String email, List disciplinas)
	  {
	    super();
	    this.id = id;
	    this.nome = nome;
	    this.idade = idade;
	    this.email = email;
	    this.disciplinas = disciplinas;
	  }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List getDisciplinas() {
		return disciplinas;
	}



	public void setDisciplinas(List disciplinas) {
		this.disciplinas = disciplinas;
	}
	  
	  

}

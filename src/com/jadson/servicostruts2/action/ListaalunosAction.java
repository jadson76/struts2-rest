package com.jadson.servicostruts2.action;

import java.util.Collection;

import com.jadson.servicostruts2.dao.AlunoDAO;

public class ListaalunosAction {
	
	 private Collection alunos;
	 private String tipoRetorno;
	 

	  public String execute() {
	    alunos = AlunoDAO.getListaAlunos();
	    return getTipoRetorno();

	  }

	  private String getTipoRetorno() {

	    if (tipoRetorno == null)
	      tipoRetorno = "json";

	    return tipoRetorno;

	  }

	  public Collection getAlunos() {
	    return this.alunos;

	  }

	  public void setTipoRetorno(String tipoRetorno) {
	    this.tipoRetorno = tipoRetorno;

	  }
}

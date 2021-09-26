package com.jadson.servicostruts2.action;

import com.jadson.servicostruts2.dao.AlunoDAO;
import com.jadson.servicostruts2.entity.Aluno;

public class AlunoAction {
	
	private Aluno aluno;
	private String id;
	private String tipoRetorno;

	public String execute() {

		aluno = AlunoDAO.getAluno(id);
		return getTipoRetorno();

	}

	public Aluno getAluno() {
		return this.aluno;
	}

	private String getTipoRetorno() {

		if (tipoRetorno == null)
			tipoRetorno = "json";

		return tipoRetorno;

	}

	public void setTipoRetorno(String tipoRetorno) {
		this.tipoRetorno = tipoRetorno;

	}

	public void setId(String id) {
		this.id = id;
	}

}

package com.jadson.servicostruts2.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jadson.servicostruts2.entity.Aluno;
import com.jadson.servicostruts2.entity.Disciplina;

public class AlunoDAO {

	private static Map alunos;

	static {

		alunos = new HashMap();

		alunos.put("101", constroiAluno(101L, "Ari Dias",

				"ari@domain.com", 27));

		alunos.put("102", constroiAluno(102L, "Luciana Maria",

				"medellia@domain.com", 20));

		alunos.put("103", constroiAluno(103L, "Priscilla Marques",

				"pmd@domain.com", 19));

	}

	public static Aluno getAluno(String id) {

		return (Aluno) alunos.get(id);

	}

	public static Collection getListaAlunos() {

		return alunos.values();

	}

	private static List getDisciplinas() {

		List disciplinas = new ArrayList();

		disciplinas.add(new Disciplina(1l, "Matemática"));

		disciplinas.add(new Disciplina(2l, "Português"));

		return disciplinas;

	}

	private static Aluno constroiAluno(Long id, String nome,

			String email, int idade)

	{

		List disciplinas = getDisciplinas();

		return new Aluno(id, nome, idade, email, disciplinas);

	}
}

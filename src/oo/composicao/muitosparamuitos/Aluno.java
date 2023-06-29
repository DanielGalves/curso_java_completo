package oo.composicao.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	//Construtor de aluno que obriga informar um nome no momento da criação do Aluno
	Aluno(String nome){
		this.nome = nome;
	}
	
	//metodo que aduiciona um curso na lista Cursos e adiciona o curso ao aluno
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		//para cada curso que o aluno tem
		for(Curso curso: this.cursos) {
		//se o curso for iqual ao nome passado por parametro retornara o nome do curso que o aluno tem 	
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}			
		}
		 return null;
	}
	
	
	//Converte um objeto em uma String
	public String toString() {
		return nome;
	}

}

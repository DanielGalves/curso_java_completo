package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List <Aluno> alunos = new ArrayList<>();
	
	
	//Cria um construtor qu
	Curso (String nome){
		this.nome = nome;
	}
	
	//metodo que adiciona um aluno na lista de alunos e adiciona o aluno a um curso
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	Aluno obterAlunoPorNome(String nome) {
		
		for(Aluno aluno: this.alunos) {
			
			if(aluno.nome.equalsIgnoreCase(nome)) {
				return aluno;
			}
		}
		
		return null;
	}
	
	//Converte um objeto em uma String
	public String toString() {
		return nome;
	}

}

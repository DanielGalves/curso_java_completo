package oo.composicao.muitosparamuitos;

public class CursoTeste {
	
	public static void main(String args[]) {
		
		//instancia objetos do tipo Aluno
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("José");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("PHP Avançado");
		Curso curso3 = new Curso("JavaScript para iniciantes");
	
		
		//chama o metodo adicionarAluno e adiciona o aluno1 na lista de alunos do curso1
		curso1.adicionarAluno(aluno1);
		//chama o metodo adicionarAluno e adiciona o aluno3 na lista de alunos do curso1
		curso1.adicionarAluno(aluno3);
		
		//Chama o metodo adicionarCurso e adiciona o curso2 na lista de cursos do aluno2
		aluno2.adicionarCurso(curso2);
		//Chama o metodo adicionarCurso e adiciona o curso3 na lista de cursos do aluno2
		aluno2.adicionarCurso(curso3);
		
		//Chama o metodo adicionarAluno e adiciona o aluno1 na lista de alunos do curso3		
		curso3.adicionarAluno(aluno1);
		//Chama o metodo adicionarCurso e adiciona o curso2 na lista de cursos do aluno3
		aluno3.adicionarCurso(curso2);
		
		//Em cada interação deste o for adiciona o nome do aluno inscrito no curso1 e 
		//adiciona na variavel aluno e imprime o nome do aluno da interação
		//e depois imprime o nome do curso1
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Meu nome é " + aluno.nome);
			System.out.println("Estou matriculado no curso " + curso1.nome + "\n");
		}
		
		//mostra todos os alunos matriculados no curso1 que o aluno1 está matriculado
		System.out.println(aluno1.cursos.get(0).alunos);
	
		//Cria uma variavel de nome cursoEncontrado do tipo Curso 
		//Esta variavel recebe o parametro Java Completo e executa o metodo obterCursoPorNome
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		//Aqui ele verificar se a variavel cursoEncontrado for diferente de nulo 
		if ( cursoEncontrado != null) {
			
			System.out.println("Curso Encontrado:");
			// imprime o nome do curso encontrado
			System.out.println(cursoEncontrado.nome);
			//imprime o nome de todos os alunos matriculados no curso encontrado
			System.out.println("Alunos matriculados neste curso: " + cursoEncontrado.alunos);
			
		}
		
	}

}

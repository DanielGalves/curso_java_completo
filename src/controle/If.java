package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("informe a nota: ");
		 double nota = scanner.nextDouble();
		 
		 if(nota >= 7 ) {
			 System.out.println("Parabens! ");
			 System.out.println("Aluno aprovado!!!");
		 }
		if (nota < 7 && nota >= 5) {
			System.out.println("Aluno está de recuperação!!");
		}
		if(nota < 5.0 ) {
			System.out.println("Aluno está reprovado!!!");
		}
		
		scanner.close();
	}

}

package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double totalNotas = 0;
		int cont = 0;
		do {
			
			System.out.println("Informe a nota");
			nota = scanner.nextDouble();
			
			if(nota >10 || nota < 0) {
				System.out.println("Nota invalida");
							
			}else if ( nota != -1) {
				totalNotas = totalNotas + nota;
				cont++;				
			}			
			
		}while(nota != -1.0);
		
		System.out.println("a media das notas é: " + totalNotas/cont );
				
		scanner.close();
	}
}

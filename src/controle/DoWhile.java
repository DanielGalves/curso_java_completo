package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto = "";
		
		do {
			
			System.out.println("Diga as palavras magicas para sair:");
			texto = scanner.nextLine();
			
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Até logo!!!");
		
		scanner.close();
	}
}

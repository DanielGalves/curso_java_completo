package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String valor = "";
		
		while(valor.equalsIgnoreCase("sair")) {
			
			System.out.println("Diga alguma coisa: ");
			valor = scanner.nextLine();
			 
		}
		
		scanner.close();
	}
	
	
}

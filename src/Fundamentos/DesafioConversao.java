package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o salario :");
		String salario1 = scanner.nextLine().replace("," , ".");
		System.out.println("Informe o salario :");
		String salario2 = scanner.nextLine().replace("," , ".");
		System.out.println("Informe o salario :");
		String salario3 = scanner.nextLine().replace("," ,".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		double soma = valor1 + valor2 + valor3;
		
		System.out.println("A media salarial é: " + soma/3);
		
		
		scanner.close();
		
		
	}

}

package controle.Exercicios;

import java.util.Scanner;

//Criar um programa que enquanto estiver recebendo números positivos, 
//imprime no console a soma dos números inseridos, caso receba um número negativo, 
//encerre o programa. Tente utilizar a estrutura do while.

public class NumerosPositivos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		while(num>=0) {
			
			System.out.println("Informe um numero: ");
			num = entrada.nextInt();
			soma += num;
			System.out.println("A soma dos numeros informados é: " + soma);
			
		}
		
		
		entrada.close();
	}

}

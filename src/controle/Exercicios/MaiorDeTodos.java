package controle.Exercicios;

import java.util.Scanner;

// Crie um programa que recebe 10 valores e ao final imprima o maior número.

public class MaiorDeTodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maiorValor = 0;

		for (int i = 1; i < 10; i++) {
			System.out.println("Informe um numero: ");
			int valor = scanner.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			}

		}

		System.out.println("O maior valor informado foi: " + maiorValor);

		scanner.close();
	}

}

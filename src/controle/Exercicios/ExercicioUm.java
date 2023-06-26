package controle.Exercicios;

import java.util.Scanner;

//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par
public class ExercicioUm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = scanner.nextInt();
		if (num <= 10 && num >= 0) {
			System.out.println("Está entre 0 e 10");
			if ((num % 2) == 0) {
				System.out.println(num + " é um numero par ");
			}
		} else {
			System.out.println("Não atende aos requisitos");
		}

		scanner.close();
	}
}

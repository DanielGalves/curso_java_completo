package controle.Exercicios;

import java.util.Scanner;

//Criar um programa informa se o ano atual é um ano bissexto
public class ExercicioDois {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o ano: ");
		int ano = scanner.nextInt();

		if ((ano % 4) == 0) {

			System.out.println(ano + " é um ano Bissexto");

		} else {

			System.out.println("Não e ano Bissexto");

		}

		scanner.close();

	}

}

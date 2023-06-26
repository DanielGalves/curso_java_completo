package controle.Exercicios;

import java.util.Scanner;

//Criar um programa que receba uma palavra e imprime no console letra por letra.

public class LetraPorLetra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.next();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		entrada.close();

	}

}

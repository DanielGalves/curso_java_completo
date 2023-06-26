package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] arg) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("informe a quantidade de notas:");
		int numeroDeNotas = scanner.nextInt();

		double[] notas = new double[numeroDeNotas];

		for (int i = 0; i != notas.length; i++) {
			System.out.println("Informe a " + (i + 1) + "ª nota");
			notas[i] = scanner.nextDouble();

		}

		double totalNotas = 0;
		
		//foreach percorre todo o Array notas e adiciona cada indice em nota
		for (double nota : notas) {
			totalNotas += nota;
		}

		System.out.println("media: " + (totalNotas / notas.length));

		scanner.close();
	}
}

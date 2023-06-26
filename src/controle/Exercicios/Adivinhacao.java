package controle.Exercicios;

import java.util.Scanner;

//Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
//Armazene um numero aleatório em uma variável. 
//O Jogador tem 10 tentativas para adivinhar o número gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
//e imprima se o número inserido é maior ou menor do que o número armazenado.

public class Adivinhacao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero entre 0 e 100: ");
		int num = entrada.nextInt();
		
		for (int i = 9; i >= 0; i--) {
			System.out.println("Adivinhe o numero: ");
			int tentativa = entrada.nextInt();
			
			if(tentativa == num) {
				System.out.println("Parabens você acertou!!!");
				break;
			}else if (tentativa < num) {
				System.out.println("Tente novamente, o numero informado e menor que o armazenado!");
				System.out.println("Você ainda tem: " + i + " tentativas!");
				
			}else if(tentativa > num) {
				System.out.println("Tente novamente, o numero infomrado e maior que o armazenado!");
				System.out.println("Você ainda tem: " + i + " tentativas!");
			}
			
		}
		
		entrada.close();
	}

}

package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main (String arg[]) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("informe uma operação ( + ), ( - ), ( * ), ( / ) ou ( % ): ");
		String operador = scanner.next();
				
		System.out.println("informe um numero: ");
		double num1 = scanner.nextDouble();
		System.out.println("Infomer outro numer: ");
		double num2 = scanner.nextDouble();
		
		double resultado = "+".equals(operador)? num1 + num2:0;
		resultado = "-".equals(operador)? num1 - num2:resultado;
		resultado = "*".equals(operador)? num1 * num2:resultado;
		resultado = "/".equals(operador)? num1 / num2:resultado;
		resultado = "%".equals(operador)? num1 % num2:resultado;
		
		
		System.out.println("Resultado:" +  resultado );
		
		
		scanner.close();
	}

}

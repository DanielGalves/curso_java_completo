package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados){
			System.out.println(nome);
		}
	
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		
		//forma simplificada do codigo anterior
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
	
	}
}

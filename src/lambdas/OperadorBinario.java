package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.0, 9.0));
		
		BiFunction<Double, Double, String> resultado = (n1 , n2) -> {
			 double resultadoFinal = (n1 + n2)/2;
			 return resultadoFinal >= 7 ? "Aprovado!!!" : "Reprovado";			
			
		};
		
		System.out.println(resultado.apply(7.5, 5.5));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado!!!" : "Reprovado!!!";
				
		System.out.println(media.andThen(conceito).apply(7.5, 8.3));
		
		
	}

}

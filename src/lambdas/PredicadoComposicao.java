package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//Verificar se o numero passado como parametro e par
		System.out.println(isPar.test(123));
		//Verifica se o numero passado como parametro e par e tem tres digitos
		System.out.println(isPar.and(isTresDigitos).test(223));
		//Verifica se o numero passado como parametro e par ou tem tres digitos
		System.out.println(isPar.or(isTresDigitos).test(12));
		
	}
}

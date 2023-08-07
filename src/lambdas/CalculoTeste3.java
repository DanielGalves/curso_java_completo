package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

public static void main(String[] args) {
	
	// Utilizando uma interface funcional ja existente no java que realiza a mesma função 
	// que a interface criada Calculo
	
	BinaryOperator<Double> calc = (x , y) -> { return x + y; };
	System.out.println(calc.apply(2.0,3.0));
	//forma otimizada para criar função lambda
	calc = (x, y) -> x * y;
	System.out.println(calc.apply(2.0,3.0));
	
	BinaryOperator<Integer> calc2 = (x , y) -> { return x + y; };
	System.out.println(calc2.apply(2,3));
	//forma otimizada para criar função lambda
	calc = (x, y) -> x * y;
	System.out.println(calc2.apply(2,3));
	
	
}
	
	
}


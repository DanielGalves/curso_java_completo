package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String Args[]) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!");
				
		Produto p1 = new Produto("Notebook", 2879.99, 0.1);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Caneta", 10.99, 0.1);
		Produto p3 = new Produto("Caderno", 29.99, 0.1);
		Produto p4 = new Produto("Borracha", 9.99, 0.1);
		Produto p5 = new Produto("Lapiz", 0.99, 0.1);
		
		List<Produto> produtos = Arrays.asList(p1 ,p2 ,p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p ->System.out.println(p.preco));
		produtos.forEach(System.out::println);
				
		
	}

}

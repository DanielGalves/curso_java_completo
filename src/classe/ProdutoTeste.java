package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		
		double precoFinal1 = p1.precoComDesconto();
		System.out.println("Produto: " + p1.nome);
		System.out.println("Preço: " + p1.preco);
		System.out.printf("Preço com desconto: %.2f", precoFinal1);
		System.out.printf("\nPreço com desconto do gerente: %.2f", p1.precoComDesconto());

		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		double precoFinal2 = p2.precoComDesconto();

		System.out.println("\n\nProduto: " + p2.nome);
		System.out.println("Preço: " + p2.preco);
		System.out.printf("Preço com desconto: %.2f", precoFinal2);
		System.out.printf("\nPreço com desconto do gerente: %.2f", p2.precoComDesconto());

	}

}

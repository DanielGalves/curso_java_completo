package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 10, 5.45));
		compra1.adicionarItem(new Item("Lapiz", 25, 2.50));
		compra1.adicionarItem(new Item("Caderno", 5, 9.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
			
		
		
		
	}

}

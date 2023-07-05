package oo.composicao.desafioRelacionamento;

public class ClienteTeste {
	
	public static void main(String args[]) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10.0 , 2);
		compra1.adicionarItem("Notebook", 1000, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Lapis", 5.0 , 10);
		compra2.adicionarItem("Impressora", 300, 5);
		
		Cliente cliente = new Cliente("Maria Julia");
		cliente.compras.add(compra2);
		cliente.compras.add(compra1);
		
		
		System.out.println(cliente.obterValorTotal());
		
	}

}

package oo.composicao.desafioRelacionamento;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	
	//Metodo que adiciona um item a lista de compras
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p,qtde));
		
	}
	
	void adicionarItem(String nome,double valor, int qtde) {
		var produto = new Produto(nome, valor);
		this.itens.add(new Item(produto, qtde));		
	}
	
	
	//cria um metodo para obter o valor total da compra
	double obterValorTotal() {
		double total = 0;
		
		//Cria a variavel item do tipo Item
		//e percorre com o laço for todos os itens da lista de itens
		for(Item item: itens) {
			total += item.qtd * item.produto.valor;			
		}
		
		
		return total;
	}
	
}

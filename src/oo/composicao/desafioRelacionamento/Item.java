package oo.composicao.desafioRelacionamento;

public class Item {

	final int qtd;
	
	//Cria uma variavel de nome produto do tipo Produto
	final Produto produto;
	
	//Cria um construtor para Item, que obriga ao criar um objeto do tipo Item deve obrigatoriamente 
	//inserir um produto e a quantidade deste produto
	Item(Produto produto, int qtd){
		this.qtd = qtd;
		this.produto = produto;
	}
	 
	
}

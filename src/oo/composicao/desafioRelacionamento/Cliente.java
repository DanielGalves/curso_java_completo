package oo.composicao.desafioRelacionamento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	//Construtor que obriga a inserir um nome no momento d criação do cliente
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		//cri a variavel total
		double total = 0;
		
		//Cria uma variavel de nome compra do tipo Compra 
		//e percorre com o laço for todas as compras do cliente
		for(Compra compra: compras) {
			
			//em cada loop e adicionado o valor de obterValorTotal em total
			total += compra.obterValorTotal();
			
		}
		
		//retorna o valor de toral
		return total;
	}
	
	
}

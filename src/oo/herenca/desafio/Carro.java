package oo.herenca.desafio;

public class Carro {
	
	int velocidadeAtual = 0;
	
	int acelerar(Carro acelerador) {
		
		velocidadeAtual += 5;		
		return velocidadeAtual;
	}
	
	
	int frear(Carro freio) {
		
		if (velocidadeAtual > 5) {
		
			velocidadeAtual -= 5;
			return velocidadeAtual;
			
		}else {
			return velocidadeAtual;
		}
		
	}

}

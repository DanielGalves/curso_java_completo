package oo.herenca.desafio;

public class Uno extends Carro {
	
	Uno(){
		this(300);		
	}

	Uno(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	//void acelerar(Carro acelerador) {		
	//	velocidadeAtual += 15;		
		
	//}
	
}

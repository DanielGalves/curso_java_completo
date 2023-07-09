package oo.herenca.desafio;

public class Uno extends Carro {
	
	public Uno(){
		this(300);		
	}

	public Uno(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	//void acelerar(Carro acelerador) {		
	//	velocidadeAtual += 15;		
		
	//}
	
}

package oo.herenca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int delta = 5;
	
	public Carro(){
		this(0);
	}
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void acelerar() {
		if((velocidadeAtual + delta) > VELOCIDADE_MAXIMA) {
			
			velocidadeAtual = VELOCIDADE_MAXIMA;
			
		}else {
			
			velocidadeAtual += delta;		
			
		}
	}
	
	
	public void frear() {
		
		if (velocidadeAtual > 5) {
		
			velocidadeAtual -= 5;
			
		}else {
			 velocidadeAtual = 0;		}
		
	}

}

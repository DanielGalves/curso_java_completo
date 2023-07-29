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
		if((velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA) {
			
			velocidadeAtual = VELOCIDADE_MAXIMA;
			
		}else {
			
			velocidadeAtual += getDelta();		
			
		}
	}
	
	
	public void frear() {
		
		if (velocidadeAtual > 5) {
		
			velocidadeAtual -= 5;
			
		}else {
			 velocidadeAtual = 0;		}
		
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	public int getDelta(){
		return delta;
	}	
}

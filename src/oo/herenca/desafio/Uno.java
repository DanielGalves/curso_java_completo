package oo.herenca.desafio;

public class Uno extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Uno(){
		this(300);		
	}

	public Uno(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		}else if (!ligarTurbo && !ligarAr) {
			return 20;
		}else {		
			return 15;
	
		}
	}
	
	//void acelerar(Carro acelerador) {		
	//	velocidadeAtual += 15;		
		
	//}
	
}

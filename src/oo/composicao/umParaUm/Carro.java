package oo.composicao.umParaUm;

public class Carro {
	
	
	Motor motor = new Motor();
	
	void ligar() {
	 motor.ligado = true;
	}
	
	void desligado() {
		motor.ligado = false;
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}

	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}
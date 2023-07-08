package oo.herenca;

public class Heroi extends Jogador{
	
	
	Heroi(){
		this(0, 0);
	}
	
	Heroi(int x, int y) {
		super(x,y);
	}
	
	boolean atacar(Jogador oponente) {
		//cria uma variavel de nome ataque que recebe o metodo atacar da classe pai que foi chamada utilizando o metodo super
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		//retorna o conteudo da variavel ataque
		return ataque1 || ataque2 ;
	}

}

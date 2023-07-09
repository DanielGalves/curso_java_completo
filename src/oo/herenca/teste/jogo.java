package oo.herenca.teste;

import oo.herenca.Heroi;
import oo.herenca.Monstro;

public class jogo {
	
	public static void main(String args[]) {
		
		Heroi heroi = new Heroi(20,10);
				
		Monstro monstro = new Monstro();
		monstro.x = 20;
		monstro.y = 11;
		
		System.out.println("Vida do Heroi:   " + heroi.vida);
		System.out.println("Vida do Monstro: " + monstro.vida);
		
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida do Heroi:   " + heroi.vida);
		System.out.println("Vida do Monstro: " + monstro.vida);
		
		
		//j1.andar(Direcao.OESTE);
		
		//System.out.println(j1.y);
		//System.out.println(j1.x);
		
		
		
		
	}

}

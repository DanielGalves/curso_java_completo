package oo.herenca;

public class jogo {
	
	public static void main(String args[]) {
		
		Heroi j1 = new Heroi();
		j1.x = 20;
		j1.y = 10;
		
		Monstro j2 = new Monstro();
		j2.x = 20;
		j2.y = 11;
		
		System.out.println("Vida do Heroi:   " + j1.vida);
		System.out.println("Vida do Monstro: " + j2.vida);
		
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("Vida do Heroi:   " + j1.vida);
		System.out.println("Vida do Monstro: " + j2.vida);
		
		
		//j1.andar(Direcao.OESTE);
		
		//System.out.println(j1.y);
		//System.out.println(j1.x);
		
		
		
		
	}

}

package oo.herenca.desafio;

public class Corrida {
	
	public static void main(String args[]) {
	
	Carro carro = new Carro();
	Uno uno = new Uno();
	Gol gol = new Gol();
	
	System.out.println("Velocidade inicial do Uno: " + uno.velocidadeAtual);
	System.out.println("Velocidade inicial do Gol: " + gol.velocidadeAtual);
	
	uno.acelerar();
	gol.acelerar();
	
	System.out.println("Velocidade atual do Uno: " + uno.velocidadeAtual);
	System.out.println("Velocidade atual do Gol: " + gol.velocidadeAtual);
	
	uno.frear();
	gol.frear();
	
	System.out.println("Velocidade do Uno apos frear: " + uno.velocidadeAtual);
	System.out.println("Velocidade do Gol apos frear: " + gol.velocidadeAtual);
	
	
	
	
	
	}

}

package oo.herenca.teste;

import oo.herenca.desafio.Carro;
import oo.herenca.desafio.Gol;
import oo.herenca.desafio.Uno;

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
	
	uno.ligarTurbo();
	uno.acelerar();
	System.out.println("Velocidade atual do Uno apos ligar o turbo: " + uno.velocidadeAtual);
	
	uno.frear();
	System.out.println("Velocidade do Uno apos frear sem desligar o turbo: " + uno.velocidadeAtual);
	
	uno.desligarTurbo();
	uno.frear();
	System.out.println("Velocidade do Uno apos frear apos desligar o turbo: " + uno.velocidadeAtual);
	
	
	}

}

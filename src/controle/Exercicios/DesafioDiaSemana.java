package controle.Exercicios;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	
	public static void main(String[] arg) {
		
		String entrada = JOptionPane.showInputDialog("Informe o dia da semana:");
		
		if(entrada.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}else if (entrada.equals("segunda") || entrada.equals("Segunda")) {
			System.out.println(2);
		}else if (entrada.equals("terca") || entrada.equals("Terca") || entrada.equals("terça") || entrada.equals("Terça")) {
			System.out.println(3);
		}else if (entrada.equals("quarta") || entrada.equals("Quarta")) {
			System.out.println(4);
		}else if (entrada.equals("quinta") || entrada.equals("Quinta")) {
			System.out.println(5);
		}else if (entrada.equals("sexta") || entrada.equals("Sexta")) {
			System.out.println(6);
		}else if (entrada.equals("sabado") || entrada.equals("Sabado") || entrada.equals("sábado") || entrada.equals("Sábado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido");
		}		
		
	}
}

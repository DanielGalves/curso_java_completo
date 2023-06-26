package controle;

import javax.swing.JOptionPane;

public class IfElseIf {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("informe a nota:");
		double nota = Double.parseDouble(valor.replace(",", "."));
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		}else if(nota >=8.1 ) {
			System.out.println("Conceito A");
		}else if(nota >=6.1 ) {
			System.out.println("Conceito B");
		}else if(nota >=4.1 ) {
			System.out.println("Conceito C");
		}else if(nota >=2.1 ) {
			System.out.println("Conceito D");
		}else {
			System.out.println("Conceito E");
		}	
		
		
	}
}

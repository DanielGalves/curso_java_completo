package oo.polimorfismo;

public class Jantar {
	public static void main(String Args[]) {
	
		Pessoa convidado = new Pessoa(99.65);
	
		Arroz igrediente1 = new Arroz(0.2);	
		Feijao igrediente2 = new Feijao(0.1);
		convidado.come(igrediente1);
		convidado.come(igrediente2);
		
		System.out.println(convidado.getPeso());
		
		
		Sorvete sobremesa = new Sorvete(0.4); 
		convidado.come(sobremesa);
		
		System.out.println(convidado.getPeso());
		
		
	}
}

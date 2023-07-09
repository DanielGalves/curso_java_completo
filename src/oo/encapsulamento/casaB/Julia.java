package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		//Ana so consegue acessar o atributo que esta definido como public em Ana
		//pois ela nao esta recebendo nenhum atributo como herança de Ana e tambem nao esta no mesmo pacote
		
		System.out.println(sogra.segredo);
		System.out.println(sogra.facoDentroDeCasa);
		System.out.println(sogra.formaDefalar);
		System.out.println(sogra.todosSabem);
			
			
		
	}
	

}

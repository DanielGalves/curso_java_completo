package oo.encapsulamento.casaA;

public class Paulo {
	
	
	
	void testeAcessos() {
		Ana esposa = new Ana();	
		
		//Somente o atributo "segredo" nao pode ser acessado pois esta com visibilidade private
		//os demais podem ser acessados por Paulo pois Peulo poertence ao mesmo pacote que Ana
		//System.out.println(esposa.segredo);
		
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDefalar);
		System.out.println(esposa.todosSabem);
		
		
	}

}

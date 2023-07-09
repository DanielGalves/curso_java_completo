package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	

	
	void testeAcessos() {
		
		@SuppressWarnings("unused")
		Ana mae = new Ana();
		
		//Esses atributos nao podem ser acessados 
		//pois estão com nivel de encapsulamento private e default
		//e Pedro nao pertence ao mesmo pacote que Ana
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		
		//nao preciso instanciar um objeto tipo Ana 
		//pois os atributos ja estao sendo recebidos por herança
		//Esses atributos podem ser acessados pois "todosSabem" esta 
		//com nivel de acesso public e "formaDeFalar" esta como 
		//nivel protected entao e transmitido via herança
		
		System.out.println(formaDefalar);
		System.out.println(todosSabem);
		
		
	}

}

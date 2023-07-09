package oo.encapsulamento.casaB;


import oo.encapsulamento.casaB.Pedro;

public class Luiz extends Pedro{
	
	//Nao e necessario instanciar um objeto para herdar atributos protected e public de Ana pois Luiz herda esses atributos de Pedro por Herança
	
	void testeAcessos() {
				
		//Luiz nao consegue acessar esses atributos pois Luiz nao herda diretamente de Ana
		System.out.println(segredo);
		System.out.println(facoDentroDeCasa);
		//Luiz consegue acessar os atributos "formaDeFalar" e "todosSabem" pois herdou esses atributos de Pedro .
		System.out.println(formaDefalar);
		System.out.println(todosSabem);
		
		
	}

}

package classe.desafioDoModulo;

//

public class Jantar {
	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Macarrao",0.7);
		Comida c2 = new Comida("Frango", 0.5);
		
		Pessoa p = new Pessoa("Maria", 76);
		
		System.out.println(p.apresentar());
		p.comer(c1);
				
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
}

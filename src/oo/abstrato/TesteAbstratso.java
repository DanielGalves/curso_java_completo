package oo.abstrato;

public class TesteAbstratso {
	
	public static void main(String[] Args) {
		
		Mamifero a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println(a.mamar());
		
		
	}

}

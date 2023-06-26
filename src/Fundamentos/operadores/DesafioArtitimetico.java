package Fundamentos.operadores;

public class DesafioArtitimetico {
	public static void main(String[] args) {
		
		double a = 6 * (3+2);
		double b = Math.pow(a, 2);
		double c = 3 * 2;
		double d = b/c;
		
		double e = ((1-5) * (2-7))/2;
		double f = Math.pow(e, 2) ;
		
		double g = d - f;
		double h = Math.pow(g, 3);
		
		double i = Math.pow(10, 3);
		
		double resultado = h/i;
		
		System.out.println(resultado);
		
		//double a = Math.pow((6 * (3+2)), 2)/(3*2);
		//double b = Math.pow(((1-5) * (2-7))/2,2);
			
		//double c = Math.pow((a-b), 3);
		//double d = Math.pow(10, 3);
		
		//double resultado = c/d;
		
		
		
	}
}

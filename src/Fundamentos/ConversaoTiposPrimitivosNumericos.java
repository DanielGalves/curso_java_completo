package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main (String arg[]) {
		 double a = 1;//implicita
		 System.out.println(a);
		 
		 float b = (float) 1.2345678888;//explícita (CAST)
		 System.out.println(b);
		
		 int c = 127;
		 byte d = (byte) c;// explícita (CAST)
		 System.out.println(d);
		 
		 double e = 1;
		 int f = (int) e;// exícita (CAST)
		 System.out.println(f);
	}
}

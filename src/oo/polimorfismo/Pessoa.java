package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	Pessoa(double peso){
		setPeso(peso);
	}
	
	public void come(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void come(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void come(Sorvete sobremesa) {
		this.peso += sobremesa.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}

}

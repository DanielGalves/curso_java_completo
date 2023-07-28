package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa (String nome,int idade ) {
		setIdade(idade);
		
		setNome(nome);
	}
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >=0 && idade <=120) {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Olá eu sou " + getNome() + " e tenho  " + getIdade() + " anos";
	}
}

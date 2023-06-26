package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		
		if (objeto instanceof Usuario) {//objeto passado e uma instancia de usuario?
		Usuario outro = (Usuario) objeto;
		boolean nomeIgual = outro.nome.equals(this.nome);// cria a variavel nomeIgual que recebe o valor da variavel outro.nome se for igual a this.nome
		boolean emailIgual = outro.email.equals(this.email);// cria a variavel emailIgual que recebe o valor da variavel outro.email se ela for igual a this.email
		
		
		return nomeIgual && emailIgual;// retorna um valor boolean true ou false
		}else {
			return false;
		}
	}

}

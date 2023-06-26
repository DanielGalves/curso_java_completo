package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		
		//realiza a conversao automatica usando o Cast
		conjunto.add(1.2);//insere um valor double no conjunto
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho de conjunto é : " + conjunto.size());// imprime o tamanho do cpnjunto
		
		//tenta inserir mais dois valores no conjunto porem o hashset nao aceita a inserçao de valores repetidos
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho de conjunto é : " + conjunto.size());
		
		//remove valores do conjunto e retorna se foi possivel ou nao
		System.out.println(conjunto.remove("teste"));//retorna false devido nao existir um valor "teste" no conjunto
		System.out.println(conjunto.remove("Teste"));// retorna true
		System.out.println(conjunto.remove('x'));//retorna true
	
		System.out.println("Tamanho de conjunto é : " + conjunto.size());//imprime o novo tamanho do conjunto
		
		System.out.println(conjunto.contains('x'));//verifica se contem o valor x dentro de conjunto
		System.out.println(conjunto.contains(1));// verifica se contem o valor 1 dentro de conjunto
		System.out.println(conjunto.contains(true));// verifica se contem o valor true dentro de conjunto 
		
		Set nums = new HashSet(); //cria novo hashset de nome nums
		nums.add(1);//adiciona o valor 1 dentro de nums
		nums.add(2);// adiciona o valor 2 dentro de nums
		nums.add(3);// adiciona o valor 3 dentro de nums
		
		System.out.println("Valores dentro de nums: " + nums);// imprime todos os valores de nums
		System.out.println("Valores dentro de conjunto: " + conjunto);//imprime todos os valores de conjunto
		
		conjunto.addAll(nums);//insere os valores de num dentro de conjunto
		
		System.out.println("Valores apos a uniao dos conjuntos num e conjunto " + conjunto);//imprime os valores de conjunto
		
		conjunto.retainAll(nums); // retem somente os valores iguais entres os conjuntos
		
		System.out.println("valores apos a interseccao dos conjuntos " + conjunto);
		
		conjunto.clear();// limpa os valores dentro de conjunto
		
		System.out.println("valores de conjunto apos utilizar o metodo clear" + conjunto);
	
	}
	
}

package classe.desafioData;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data(15, "Outubro", 2015);
		System.out.println(data1.obterData());
		
		Data data2 = new Data();
		System.out.println(data2.obterData());

	}

}

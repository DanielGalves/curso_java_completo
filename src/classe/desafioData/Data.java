package classe.desafioData;

//Instanciar 3 atributos, Dia,mes e ano

public class Data {

	int dia;
	String mes;;
	int ano;

	Data(int diaIni, String mesIni, int anoIni) {
		dia = diaIni;
		mes = mesIni;
		ano = anoIni;
	}

	Data() {
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}

	String obterData() {
		return (String) "Dia " + dia + " de " + mes + " de " + ano;
	}

}

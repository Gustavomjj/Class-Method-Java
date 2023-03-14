package classe;

public class data {
	
	int dia;
	int mes;
	int ano;
	
	// CONSTRUTORES 
	
	data(){
		dia = 01;
		mes = 01; 
		ano = 1970;	
	}
	
	data(int diaIns, int mesIns, int anoIns){ 
		dia = diaIns;
		mes = mesIns;
		ano = anoIns;
	}
	
	
	
	
	// MÉTODOS
	String obterData() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	// OU
	
	String obterData2() { 
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	

}

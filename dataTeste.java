package classe;

public class dataTeste {

	public static void main(String[] args) {
		

	data d1 = new data();
	d1.dia = 13;
	d1.mes = 3;
	d1.ano = 2023;
	
	var d2 = new data();
	d2.dia = 16;
	d2.mes = 8;
	d2.ano = 1995;
	
	System.out.printf("Hoje é dia %d do %d de %d.\n", d1.dia, d1.mes, d1.ano);
	System.out.printf("E eu nasci em %d do %d de %d.\n", d2.dia, d2.mes, d2.ano);
	
	System.out.println(d1.obterData());
	System.out.println(d2.obterData());
	
	System.out.println(d1.obterData2());
	System.out.println(d2.obterData2());
	
	// Teste dos Construtores 
	
	data d3 = new data();										// Construtor padrão
	System.out.printf("%d/%d/%d\n", d3.dia, d3.mes, d3.ano);
	
	data d4 = new data(10,11,1994);
	System.out.printf("%d/%d/%d\n", d4.dia, d4.mes, d4.ano);	// Construtor com parametros
	
	var d5 = new data();
	d5.dia = 14;
	System.out.println(d5.obterData2());
	
}
}

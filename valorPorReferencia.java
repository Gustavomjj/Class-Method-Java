package classe;

public class valorPorReferencia {

	public static void main(String[] args) {
		
		int a = 2;				// Atribuição por valor (Tipo primitivo).
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a++;
		b--;					// Os valores mudaram independentes. 
		
		System.out.println(a);
		System.out.println(b);
		
		data d1 = new data(1, 6, 2022);
		data d2 = d1;				 // Atribuição por referência (Objeto).
		
		System.out.println(d1.obterData2());
		System.out.println(d2.obterData2());
		System.out.println();
		
		d1.mes = 10;				// Aqui eu troquei as variáveis e trocou do d1 e d2. 
		d1.dia = 10;				// Porque foi trocado no objeto de referencia. 
		d1.ano = 2000;
		
		System.out.println(d1.obterData2());
		System.out.println(d2.obterData2());
		System.out.println();
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterData2());
		System.out.println(d2.obterData2());
	
		
		}
		
	static void voltarDataParaValorPadrao(data d) {		// Aqui foi criado um novo metodo para zerar a data.
			d.dia = 1;									// Foi criado fora do metodo main.
			d.mes = 1;
			d.ano = 1970;			 
		}
		
		
}

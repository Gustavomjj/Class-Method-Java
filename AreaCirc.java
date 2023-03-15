package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.14;			// Aqui ele foi transformado em uma constante final. Nao pode alterar o valor. 
	
	AreaCirc(double raioInicial) {			// Construtor
		raio = raioInicial;
	}
	
	
	double area() {							// Metodo
		return pi * Math.pow(raio, 2);
	}

	static double area(double raio) {		// Metodo static
		return pi * Math.pow(raio, 2);		
	}
	
	double cubo(double valor) { 
		return valor * valor * valor;
	}
	
	static double cubo2(double valor) { 
		return valor * valor * valor;
	}
	
}

package classe.DesafioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rogerio", 80);
	//	p1.nome = "Rogerio";
	//	p1.peso = 80.0;
		
		Pessoa p2 = new Pessoa("Gustavo", 75); 
	//	p2.nome = "Gustavo";
	//	p2.peso = 75.0;
		
		Comida feijao = new Comida("feijão", 0.3);
		
		Comida arroz = new Comida("arroz", 0.2);
		
		Comida frango = new Comida("frango", 0.5);
		
		p1.comer(arroz.pesocomida);
		p1.comer(feijao.pesocomida);
		p1.comer(frango.pesocomida);
			
		p1.Final();
		
		p2.comer(arroz.pesocomida);
		p2.comer(frango.pesocomida);
		
		p2.Final();
		
		
	}
}

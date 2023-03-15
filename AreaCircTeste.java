package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
		System.out.println(a2.area());
		
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.pi);		// Quando utiliza o static la na classe, pode acessar a constante com o nome da classe + ponto. 
		System.out.println(AreaCirc.area(200)); // Pode utilizar nos metodos tambem. 
		
		System.out.println();
		
		AreaCirc a3 = new AreaCirc(5);			// Precisei fazer uma nova instancia para poder carregar um novo metodo. 
		System.out.println(a3.cubo(5));			
		
		
		System.out.println(AreaCirc.cubo2(5));	// Não precisei fazer uma nova instancia porque o metodo está Static. 
	}
}

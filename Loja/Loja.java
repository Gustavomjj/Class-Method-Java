package classe.Loja;

public class Loja {
	public static void main(String[] args) {
		
		
		// Clientes 
		Cliente c1 = new Cliente("Evelise", 28);
		
		Cliente c2 = new Cliente("André", 50);
		
		Cliente c3 = new Cliente("Gustavo", 20);
		
		// Produtos
		
		Produto p1 = new Produto("Iphone 15", 20000);
		
		Produto p2 = new Produto("Macbook", 15000);
		
		Produto p3 = new Produto("Apple watch 5", 4000);
		
		Produto p4 = new Produto("Airpods 4", 1000);
		
		Produto p5 = new Produto("Carregador Turbo", 300);
		
		// Compras
		
		c1.comprar(p1.preço);
		c1.comprar(p3.preço);
		c1.comprar(p4.preço);
		c1.comprar(p5.preço);
		
		c1.total();
		
		c2.comprar(p2.preço);
		c2.comprar(p3.preço);
		c2.comprar(p4.preço);
		
		c2.total();
		
		c3.comprar(p1.preço);
		c3.comprar(p2.preço);
		c3.comprar(p3.preço);
		c3.comprar(p4.preço);
		c3.comprar(p5.preço);
		
		c3.total();
		
	}

}

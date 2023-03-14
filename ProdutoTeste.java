package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 3600;
		p1.desconto = 0.15;
		
		var p2 = new Produto("Celular", 2600, 0.8);
	//	p2.nome = "Celular";
	//	p2.preco = 2599;
	//	p2.desconto = 0.2;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		
		double precoFinalP1 = p1.preco * (1 - p1.desconto);
		double precoFinalP2 = p2.preco * (1 - p2.desconto);
		double mediaCompra = (precoFinalP1 + precoFinalP2) / 2;
		
		System.out.printf("O Notebook saiu por R$ %.2f\n", precoFinalP1);
		System.out.printf("O Celular saiu por R$ %.2f\n", precoFinalP2);
		System.out.printf("A média do seu carrinho ficou R$ %.2f", mediaCompra);
		

	}

}

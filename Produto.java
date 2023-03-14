package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	// CONSTRUTORES 
	// Pode haver quantos forem necessários.
	
	Produto(){		// Construtor padrão
		
	}
	
	Produto(String nomeInicial) {		// Construtor explícito com um parametro. 
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){	// Construtor com dois parametros. 
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){ 	// Construtor com tres parametros.
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	
	
}
 
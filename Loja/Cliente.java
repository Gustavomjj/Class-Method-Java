package classe.Loja;

import java.io.PrintStream;

public class Cliente {

	String nome; 
	int idade;
	double carrinho;
	
	Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;	
		}
	
	// Método
	
	double comprar(double preço) {
		carrinho += preço;
		return carrinho;
	}
	
	PrintStream total() {
		return System.out.printf("Nome: %s\nIdade: %d\nTotal da compra: %.2f\n\n", nome, idade, carrinho);
	}
	
}

package classe.DesafioModulo;

import java.io.PrintStream;

public class Pessoa {

	String nome;
	final double peso;
	double pesoatual;

	
	// Construtores 
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		this.pesoatual = peso;
	}
	

	// Metodos
	
	double comer(double pesocomida) {
		this.pesoatual +=  pesocomida;
		return pesoatual;		
		
	}
	
	PrintStream Final() {
		return System.out.printf("Nome: %s\nPeso antes: %.1f\nPeso atual: %.1f\n\n", nome, peso, pesoatual);
	}
	
	
	
	
	
}

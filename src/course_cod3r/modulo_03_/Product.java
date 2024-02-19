package course_cod3r.modulo_03_;

public class Product {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	public Product() {
		
	}
	
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}
 
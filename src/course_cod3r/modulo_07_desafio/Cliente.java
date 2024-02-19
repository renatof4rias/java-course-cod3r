package course_cod3r.modulo_07_desafio;

public class Cliente {

	public String nome;	
	public ClienteCPF cpf;
	public ClienteEndereco endereco;
	
	public Cliente() {
		 
	}
	
	public Cliente(String nome, ClienteCPF cpf, ClienteEndereco endereco) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.endereco = endereco;
	}
	
}

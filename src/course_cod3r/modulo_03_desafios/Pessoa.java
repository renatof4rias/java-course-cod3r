package course_cod3r.modulo_03_desafios;

import java.util.Objects;

public class Pessoa {

	public String nome;
	double peso;
	
	public Pessoa() {
		
	}
	
//	public Pessoa(String nome, double peso) {
//		this.nome = nome;
//		this.peso = peso;
//	}
	
	public void comer(Comida comida) {
		peso += comida.pesoComida;
	}
	
	public String relatorioAntes(Comida comida) {
		return " O peso de " + nome + " antes de comer é: " + peso + "Kg";
	}

	public String relatorioDepois(Comida comida) {
		return "O peso de " + nome + " depois de comer é: " + peso + "Kg";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
}

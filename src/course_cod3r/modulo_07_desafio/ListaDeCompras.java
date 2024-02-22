package course_cod3r.modulo_07_desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

	
	public List<Produto> InfoProdutos = new ArrayList<>();
	
	
	public void listaCompras() {
		
		
		for (Produto produtos : InfoProdutos) {
		var cod = produtos.codigo;
		var nome = produtos.nome;
		var quantidade = produtos.quantidade;
		var valor = produtos.valor;
		
		System.out.println("| " + cod + " | "  + nome + " | " + quantidade + " | " + valor + " |" );
		
		
		
		}
		
		
		
	}
	
	
	
	
	
}

package course_cod3r.modulo_07_desafio;

public class InfoCliente {


	
	public String impressora(Cliente cliente) {
		return  "************NOTA FISCAL************\n" +
				"\nCliente: " + cliente.nome +
				"\nCPF: " + cliente.getCPF() + 
				"\n\n********ENDERECO DE ENTREGA********\n" + 
				"\nCEP: " + cliente.getCEP() +
				"\nBairro: " + cliente.bairro +
				"\nRua: " + cliente.rua + 
				"\nCasa: " + cliente.casa +
				"\nComplemento: " + cliente.complemento;
	}
	
}
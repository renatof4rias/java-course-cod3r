package course_cod3r.modulo_07_desafio;

public class CompraTeste {

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente();
		InfoCliente ic = new InfoCliente();
		
		
		c1.nome = "Renato Gonçalves";
		c1.setCPF("02051164185");
		c1.setCEP("71692410");
		c1.bairro = "Residencial Oeste";
		c1.rua = "4";
		c1.casa = "2";
		c1.complemento = "Bar Brejeiro";
		
		
		
		
		
		
		
		
		
		 
		System.out.println(ic.impressora(c1));
		
		
	}

}

package course_cod3r.modulo_07_desafio;

import java.util.Scanner;

public class CompraTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		InfoCliente ic = new InfoCliente();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		Produto p4 = new Produto();
		Produto p5 = new Produto();
		ListaDeCompras l1 = new ListaDeCompras();
		
		
		
//========================================================================================================//		
		System.out.print("INSERIR CLIENTE ? 1- sim/ 2- nao |");
		int simOuNao = sc.nextInt();
		sc.nextLine();
		
		if (simOuNao == 1) {
			System.out.print("INSIRA O NOME: ");			
			c1.nome = sc.nextLine();
		} else if (simOuNao == 2){	
			c1.nome = " ";
		}else if (simOuNao != 1 || simOuNao != 2){	
			System.out.println("OPÇÃO INVALIDA");
		}
		
//========================================================================================================//	
		
		System.out.print("INSERIR CPF ? 1- sim/ 2- nao |");
		simOuNao = sc.nextInt();
		
		if (simOuNao == 1) {
			System.out.print("INSIRA O CPF: ");
			String cpf = sc.next();
			
			while (cpf.length() != 11) {
				System.out.println("CPF INVALIDO");
				System.out.print("INSIRA O CPF: ");
				cpf = sc.next();
			}
			c1.setCPF(cpf);
			
		} else if (simOuNao == 2){	
			c1.setCPF(" ");
		}else if (simOuNao != 1 || simOuNao != 2){	
			System.out.println("OPÇÃO INVALIDA");
		}
		
//========================================================================================================//			
		
		System.out.print("SOLICITAR ENTREGA ? 1- sim/ 2- nao |");
		simOuNao = sc.nextInt();
		
		if (simOuNao == 1) {
			System.out.print("INSIRA O CEP: ");
			String cep = sc.next();
			sc.nextLine();
			while (cep.length() != 8) {
				System.out.println("CEP INVALIDO");
				System.out.print("INSIRA O CEP: ");
				cep = sc.nextLine();
				sc.nextLine();
			}
			c1.setCEP(cep);		
			System.out.print("INSIRA O BAIRRO: ");			
			c1.bairro = sc.nextLine();
			System.out.print("INSIRA A RUA: ");
			c1.rua = sc.nextLine();
			System.out.print("INSIRA A CASA: ");
			c1.casa = sc.nextLine();
			System.out.print("INSIRA O COMPLEMENTO: ");
			c1.complemento = sc.nextLine();
		
		} else if (simOuNao == 2){	
			c1.setCEP(" ");
			c1.bairro = " ";
			c1.rua = " ";
			c1.casa = " ";
			c1.complemento = " ";
		}else if (simOuNao != 1 || simOuNao != 2){	
			System.out.println("OPÇÃO INVALIDA");
		}
//========================================================================================================//			

		p1.codigo = "01";
		p1.nome = "Arroz";
		p1.quantidade = 3;
		p1.valor = 26.99;
		
		p2.codigo = "02";
		p2.nome = "Feijão";
		p2.quantidade = 4;
		p2.valor = 6.99;
		
		p3.codigo = "03";
		p3.nome = "Macarrão";
		p3.quantidade = 2;
		p3.valor = 4.50;
		
		p4.codigo = "04";
		p4.nome = "Sal";
		p4.quantidade = 1;
		p4.valor = 1.99;
		
		p5.codigo = "05";
		p5.nome = "Molho de Tomate";
		p5.quantidade = 4;
		p5.valor = 9.25;
		
		l1.InfoProdutos.add(p1);
		l1.InfoProdutos.add(p2);
		l1.InfoProdutos.add(p3);
		l1.InfoProdutos.add(p4);
		l1.InfoProdutos.add(p5);
		
		
		
		
		
		
		
		
		System.out.println(ic.impressora(c1));
		l1.listaCompras();
		
		sc.close();
	}

}

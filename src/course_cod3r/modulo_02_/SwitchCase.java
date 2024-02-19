package course_cod3r.modulo_02_;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um Numero de 1 a 7 -> ");
		int dia = sc.nextInt();

		while (dia != 0 && dia <= 7) {
			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			}
			System.out.println("Digite um Numero de 1 a 7 -> ");
			dia = sc.nextInt();
		}
		
		System.out.println("Dia Invalido, Sistema Encerrado! ");
		sc.close();

	}

}

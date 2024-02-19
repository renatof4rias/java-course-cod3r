package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o Dia da Semana -> ");
		String dia = sc.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado") ) {
			System.out.println("7");
		} else {
			System.out.println("Dia Invalido!!!");
		}

		sc.close();
	}

}

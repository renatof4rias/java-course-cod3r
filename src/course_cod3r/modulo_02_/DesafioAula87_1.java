package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Valor -> ");
		double valor = sc.nextDouble();

		if (valor >= 0 && valor <= 10 && valor % 2 == 0) {
			System.out.println("DENTRO DO INTERVALO");
			System.out.println("PAR");
		} else if (valor >= 0 && valor <= 10 && valor % 2 != 0) {
			System.out.println("DENTRO DO INTERVALO");
			System.out.println("IMPAR");
		} else {
			System.out.println("FORA DO INTERVALO");
		}

		sc.close();
	}

}

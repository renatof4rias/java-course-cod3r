package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula60_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a Temperatura em Fahrenheit -> ");
		double a = sc.nextDouble();
		double b = (a - 32) / 1.8;

		System.out.printf("Temperatura em Celsius %.2f ",b);

		sc.close();
	}

}

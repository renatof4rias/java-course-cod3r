package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula60_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a Temperatura em Celsius -> ");
		double a = sc.nextDouble();
		double b = (1.8 * a) + 32;

		System.out.printf("Temperatura em Fahrenheit %.2f ", b);

		sc.close();
	}
}

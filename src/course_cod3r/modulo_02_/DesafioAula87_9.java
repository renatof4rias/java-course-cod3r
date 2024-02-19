package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um Valor qual quer -> ");
		int num = sc.nextInt();

		int maior = 0;

		for (int i = 1; i < 10; i++) {
			System.out.print("Insira outro Valor qual quer -> ");
			num = sc.nextInt();
			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("Maior Valor = " + maior);

		sc.close();
	}

}

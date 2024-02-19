package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Somente Números POSITIVOS -> ");
		int num = sc.nextInt();
		
		int sum = 0;
		do {
			sum += num;
			System.out.print("Digite outro Número POSITIVO ->");
			num = sc.nextInt();
		} while (num >= 0);
		
		System.out.println("Soma TOTAL dos Números POSITIVOS digitados = " + sum);
		
		sc.close();
	}

}

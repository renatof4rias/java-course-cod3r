package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um Número -> ");
		int n = sc.nextInt();
		
		switch (n % 2) {
			case 0:
				System.out.println("PAR");
				break;
			case 1:
				System.out.println("IMPAR");
				break;
			}

		sc.close();
	}

}

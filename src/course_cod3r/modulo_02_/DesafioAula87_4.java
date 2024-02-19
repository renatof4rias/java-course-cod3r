package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um Número -> ");
		double n = sc.nextDouble();
		
		if (n % 2 ==0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		

		sc.close();
	}

}

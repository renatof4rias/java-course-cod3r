package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma Palavra -> ");
		String palavra = sc.next();

		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		sc.close();
	}

}

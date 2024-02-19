package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Ano -> ");
		int ano = sc.nextInt();

		if (ano % 4 == 0) {
			System.out.println(ano + " é Bissexto");
		} else {
			System.out.println(ano + " nao é Bissexto");
		}

		sc.close();
	}

}

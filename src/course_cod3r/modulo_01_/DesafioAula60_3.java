package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula60_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a Altura (m) ->");
		var b = sc.nextDouble();
		
		System.out.print("Digite o Peso (Kg) ->");
		var a = sc.nextDouble();
		
		var imc = a / (b * b);
		
		System.out.print(imc);
		sc.close();
	}
}

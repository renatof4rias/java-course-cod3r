package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula60_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um Valor qual quer -> ");
		var a = sc.nextDouble();
		
		
		var b = Math.pow(a, 2);
		var c = Math.pow(a, 3);
		
		
		System.out.printf("Valor informado Elevado ao Quadrado = %.2f\n", b);
		System.out.printf("Valor informado Elevado ao Cubo     = %.2f ", c);
		sc.close();
	}
}

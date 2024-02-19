package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula60_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe Altura do Triangulo ->");
		var a = sc.nextDouble();
		
		System.out.print("Informe Base do Triangulo ->");
		var b = sc.nextDouble();
		
		var area = (a * b) / 2;
		
		System.out.printf("Area do Triangulo = %.2f", area);
		
		sc.close();
	}

}

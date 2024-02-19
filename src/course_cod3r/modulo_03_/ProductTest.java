package course_cod3r.modulo_03_;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("time = ");
		Double horas = sc.nextDouble();
		
		double qntAgua = Math.floor(horas * 0.5);
		
		System.out.printf("litres = %.1f", qntAgua);
		
		
		sc.close();
	}
}

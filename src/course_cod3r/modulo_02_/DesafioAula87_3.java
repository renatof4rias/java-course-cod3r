package course_cod3r.modulo_02_;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAula87_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe a Primeira nota -> ");
		double primeiraNota = sc.nextDouble();

		System.out.print("Informe a Segunda nota -> ");
		double segundaNota = sc.nextDouble();
		
		double mediaFinal = (primeiraNota + segundaNota) / 2;
		
		if (mediaFinal >= 7.0) {
			System.out.printf("Média Final | %.2f |", mediaFinal);
			System.out.println("\nSituação | Aprovado |");
		} else if(mediaFinal < 7.0 && mediaFinal > 4.0){
			System.out.printf("Média Final | %.2f |", mediaFinal);
			System.out.println("\nSituação | Recuperação |");
		} else {
			System.out.printf("Média Final | %.2f |", mediaFinal);
			System.out.println("\nSituação | Reprovado |");
		}
		
		sc.close();
	}

}

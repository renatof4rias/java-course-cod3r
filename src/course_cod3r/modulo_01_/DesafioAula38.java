package course_cod3r.modulo_01_;

import java.util.Scanner;

public class DesafioAula38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Salário -> ");
		String primeiroSalario = sc.nextLine().replace(",",".");
		System.out.print("Digite o Segundo Salario  -> ");
		String segundoSalario = sc.nextLine().replace(",",".");
		System.out.print("Digite o Terceiro Salario -> ");
		String terceiroSalario = sc.nextLine().replace(",",".");
		
		Double s1 = Double.parseDouble(primeiroSalario);
		Double s2 = Double.parseDouble(segundoSalario);
		Double s3 = Double.parseDouble(terceiroSalario);
		
		Double media = (s1 + s2 + s3) / 3;
		
		System.out.println("Média Salarial dos Últimos Três meses -> "+ media);
	
		sc.close();
	}
}

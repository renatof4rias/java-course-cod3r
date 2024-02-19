package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua nota");
		int nota = sc.nextInt();
		double somaDeNotas = 0;
		somaDeNotas = nota;
		
		int contador = 0;
		contador = contador + 1;
		
		System.out.println("Digite sua nota para continuar, ou digite 0 para encerrar");
		nota = sc.nextInt();
		somaDeNotas += nota;
		
		while (nota != 0) {
			contador += 1;
			System.out.println("Digite sua nota para continuar, ou digite 0 para encerrar");
			nota = sc.nextInt();
			somaDeNotas += nota;
			contador++;	
			
			System.out.println("Digite sua nota para continuar, ou digite 0 para encerrar");
			nota = sc.nextInt();
			somaDeNotas += nota;
			} 
		
		
		double mediaDeNotas = somaDeNotas / contador;
		
		System.out.println("Sistema Encerrado");
		System.out.println("Total de Notas Inseridas = " + contador);
		System.out.println("Soma Total de Notas Inseridas = " + somaDeNotas);
		System.out.println("Media de Notas = " + mediaDeNotas);
		
		sc.close();
	}

}

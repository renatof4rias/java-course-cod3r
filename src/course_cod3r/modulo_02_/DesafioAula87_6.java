package course_cod3r.modulo_02_;

import java.util.Scanner;

public class DesafioAula87_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 1337;
		
		System.out.println("Tente Advinhar a Senha:");
		System.out.print("Digite uma Senha Qualquer -> ");
		int senh = sc.nextInt();

		for (int i = 10; i != 1;i--) {
			
			if (senh != senha) {
				System.out.println("Senha Incorreta!\nRestam " + (i-1) + " Tentativas!" );
				System.out.print("Digite uma Senha Qualquer -> ");
				senh = sc.nextInt();
				
			} else if(senh == senha){
				System.out.println("Parabéns, Senha Correta");
				i = 2; 
			}
			
		}
		
		
		sc.close();
	}

}

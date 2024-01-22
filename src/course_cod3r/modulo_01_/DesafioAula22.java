package course_cod3r.modulo_01_;

public class DesafioAula22 {

	public static void main(String[] args) {

		//Transformar Celsius para Fahrenheit
		
		final double ab = 9.0/5.0;
		final double ba = 5.0/9.0;
		
		double celsius = 20;
		double calculo = (ab * celsius) + 32;
		double fahrenheit = calculo;
		
		
		System.err.println("Celsius para Fahrenheit ↓");
		System.out.println(celsius + " Graus Celsius é igual à: " + fahrenheit + " Fahrenheit !");
		
		
		//Transformar Fahrenheit para Celsius
		
		fahrenheit = 68; 
		calculo = (ba) * (fahrenheit - 32);
		celsius = calculo;
		
		System.err.println("Fahrenheit para Celsius ↓");
		System.out.println(fahrenheit + " Graus Fahrenheit é igual à: " + celsius + " Celsius !");
		
	}

}


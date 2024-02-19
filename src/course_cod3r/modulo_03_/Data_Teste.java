package course_cod3r.modulo_03_;

public class Data_Teste {

	public static void main(String[] args) {

		Data.dia = 13;
		Data d1 = new Data(03, 2019);

		System.out.print(d1.dateFormat());
		d1.dateFormat1();
		
		Data d2 = new Data();
		d2.mes = 9;
		d2.ano = 2002;

		System.out.print(d2.dateFormat());
		d2.dateFormat1();
		
		Data d3 = new Data();
		d3.mes = 03;
		d3.ano = 2024;
		
		System.out.print(d3.dateFormat());
		d3.dateFormat1();
		
		
		Data d4 = new Data();
		
		System.out.println(d4.dateFormat());
	}

}

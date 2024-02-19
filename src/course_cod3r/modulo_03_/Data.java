package course_cod3r.modulo_03_;

public class Data {

	static int dia;
	int mes;
	int ano;

	public Data() {
	mes = 01;
	ano = 1970;
	}

	public Data(int mes, int ano) {
		this.mes = mes;
		this.ano = ano;
	}

	public String dateFormat() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}

	public void dateFormat1() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}

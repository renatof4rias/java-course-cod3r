package course_cod3r.modulo_01_;

import java.util.Scanner;

public class Strings {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "renato farias";

		var index = s.indexOf(" ") + 1;

		var b = s.substring(0, 1).toUpperCase() + s.substring(1, index) + s.substring(index, index + 1).toUpperCase() + s.substring(index + 1);

		System.out.println(b);

		Scanner sc = new Scanner(System.in);

		int a = 1;

		sc.close();
	}
}

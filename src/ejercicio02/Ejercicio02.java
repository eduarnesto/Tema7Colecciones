package ejercicio02;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		Random ran = new Random();

		LinkedHashSet<Integer> lista = new LinkedHashSet<>();

		while (lista.size() < 10) {
			lista.add(ran.nextInt(1, 21));
		}

		System.out.println(lista);
	}

}

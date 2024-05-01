package ejercicio04;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		TreeSet<String> lista = new TreeSet<String>();
		String nombre;
		Scanner sc = new Scanner (System.in);

		while (lista.size()<5) {
			System.out.println("Introduzca un nombre");
			nombre = sc.nextLine();
			lista.add(nombre);
		}
		
		System.out.println(lista.descendingSet());
		
		sc.close();
	}

}

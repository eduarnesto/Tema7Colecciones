package ejercicio05;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio05 {

	static TreeMap<String, Integer> lista = new TreeMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				addSerie();
				break;
			case 2:
				buscarSerie();
				break;
			case 3:
				eliminarSerie();
				break;
			case 4:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Opción elegida no válida");
				break;
			}
		} while (opc != 4);
		

	}

	public static void menu() {
		System.out.println("Elija una opción");
		System.out.println("1.- Agregar serie");
		System.out.println("2.- Buscar serie");
		System.out.println("3.- Eliminar serie");
		System.out.println("4.- Salir");
	}

	public static void addSerie() {
		String serie;
		int valoracion;

		System.out.println("Introduzca el nombre de la serie");
		serie = sc.nextLine();

		System.out.println("Introduzca la valoración de la serie");
		valoracion = sc.nextInt();

		lista.put(serie, valoracion);
	}

	public static void buscarSerie() {
		String serie;

		System.out.println("Introduzca el nombre de la serie");
		serie = sc.nextLine();

		if (lista.containsKey(serie)) {
			System.out.println(lista.get(serie));
		} else {
			System.out.println("Serie no encontrada");
		}
	}

	public static void eliminarSerie() {
		String serie;

		System.out.println("Introduzca el nombre de la serie");
		serie = sc.nextLine();

		lista.remove(serie);
	}
}

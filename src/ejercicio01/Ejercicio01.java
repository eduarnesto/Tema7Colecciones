package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			lista.add(i);
		}
		
		System.out.println("Lista ordenada: "+lista);
		
		Collections.shuffle(lista);
		
		System.out.println("Lista desordenada: "+lista);
	}

}
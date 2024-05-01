package ejercicio03;

import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		String texto = "en un agujero en el suelo, vivia un hobbit. "
				+ "no un agujero humedo, sucio, repugnante, con restos de gusanos "
				+ "y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso,"
				+ " sin nada en que sentarse o que comer: era un agujero-hobbit,"
				+ " y eso significa comodidad";
		
		texto = texto.replaceAll("[^a-z]", "");
		
		for(int i = 0; i < texto.length();i++) {
			char caracter = texto.charAt(i);
			if(!map.containsKey(caracter)) {
				map.put(caracter, 1);
			}else {
				map.put(caracter,map.get(caracter)+1 );
			}
		}
		System.out.println(map);
	}

}

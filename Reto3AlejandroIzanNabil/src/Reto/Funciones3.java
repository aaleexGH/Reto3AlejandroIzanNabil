package Reto;

import java.util.Iterator;

public class Funciones3 {
	public static String numerosenfrase(String frase) {
		
		String numeros = "";
		boolean primero = true;
		for (int i = 0; i < frase.length(); i++) {
			char n1 = frase.charAt(i);
			if (Character.isDigit(n1)) {
				if (primero) {
					numeros=n1 + "";
					primero = false;
				}else {
					numeros+=","+n1;
				}
				
				
			}
		}
		return numeros;
	}
	
	public static String cifradosimple(String frase) {
		
		for (int i = 0; i < frase.length(); i++) {
			char n1 = frase.charAt(i);
			if (n1 == 'a') {
				frase.replace(n1, (char) 4);
				
				
			}else if (n1 == 'e') {
				frase.replace(n1, (char) 3);
			}else if (n1 == 'i') {
				frase.replace(n1, (char) 1);
			}else if (n1 == 'o') {
				frase.replace(n1, (char) 0);
			}else if (n1 == 'u') {
				frase.replace(n1, '_');
			}
		}
		return frase;
		
	}
	
	public static int contarvocales(String frase) {
		String vocal = "";
		String vocalalta = "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		int vocalnumero = -1000000;
		int vocalreal = 0;
		for (int i = 0; i < frase.length(); i++) {
			char n1 = frase.charAt(i);
			vocal+=n1;
			if (n1 == 'a' || n1 == 'e' ||  n1 == 'i' || n1 == 'o' || n1 == 'u' ) {
				vocalreal++;
				
			}
			if (Character.isWhitespace(n1)) {
				
				if (vocalreal > vocalnumero ) {
					vocalnumero = vocalreal;
					vocalalta = vocal;
					vocal = "";
					vocalreal = 0;
					
					
				}
					
			
			}
		}
		System.out.println("la palabra mas grande es "+ vocalalta);
		return vocalreal ;
		
	}
	
	public static String palabracorta(String frase) {
		String corta = "";
		String cortareal = "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		for (int i = 0; i < frase.length(); i++) {
			char n1 = frase.charAt(i);
			corta+=n1;
			if (Character.isWhitespace(n1)) {
				if (corta.length() < cortareal.length()) {
					cortareal = corta;
					
				}
				corta = "";
			}
		}
		return cortareal;
	}
}

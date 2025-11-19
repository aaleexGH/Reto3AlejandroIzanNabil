package Reto;

public class Funciones2 {
	public static int ContarPalabras(String frase) {
		int contador = 1;
		for (int i = 0; i < frase.length(); i++) {
			char pala = frase.charAt(i);
			if (Character.isWhitespace(pala)) {
				contador++;
			}
		}
		return contador;
	}

	public static String invertirFrase(String frase) {
		String nueva = "";
		frase += " ";
		if (frase.equals("")) {
			System.out.println("Error, introduce una frase");
		} else {
			String p = "";
			for (int i = 0; i < frase.length(); i++) {
				if (Character.isWhitespace(frase.charAt(i))) {
					nueva = p + " " + nueva;
					p = "";
				} else {
					p = p + frase.charAt(i);
				}
			}
		}
		return nueva;
	}

	public static String palabraLarga(String frase) {
		String palabra = "";
		String palabraMax = "";
		for (int i = 0; i < frase.length(); i++) {
			char pala = frase.charAt(i);
			if (!(Character.isWhitespace(pala))) {
				palabra += pala;
			} else if (palabra.length() > palabraMax.length()) {
				palabraMax = palabra;
				palabra = "";
			}

		}
		return palabraMax;
	}

	public static void main(String[] args) {
		System.out.println(palabraLarga("hola que tal"));
	}
}

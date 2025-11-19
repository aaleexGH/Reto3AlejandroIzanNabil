package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones1 {

	public static String capitalizarString(String c) {
		return c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase();
	}

	public static void menu1(Scanner sc) {
		String n = "";
		String corta = "";
		String primera = "";
		boolean primerapalabra = true;

		do {
			System.out.println("Dime un nombre: ");
			n = sc.nextLine();
			if (!n.equals("")) {
				String nombrebien = capitalizarString(n);
				System.out.println("Nombre capitalizado: " + nombrebien);

				String apodo = generarApodo(n);
				System.out.println("Apodo: " + apodo);

				if (n.length() < corta.length()) {
					corta = n;
				}

				if (n.compareTo(primera) < 0) {
					primera = n;
				}

			}

		} while (n.length() > 0);

		if (!primerapalabra) {
			System.out.println("Nombre más corto: " + capitalizarString(corta));
			System.out.println("Nombre alfabéticamente primero: " + capitalizarString(primera));
		}
	}

	public static String generarApodo(String a) {
		if (a.length() > 4) {
			return a.substring(0, 3) + a.lastIndexOf(a) + a.length();
		}
		return a + a.length();
	}

}

package Reto;

import java.util.Locale;
import java.util.Scanner;

import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones3;

public class Reto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int opcion = 0; 
		do {
			System.out.println("¿QUE DESEAS HACER?: ");
			System.out.println("1. Nombres");
			System.out.println("2. Palabras");
			System.out.println("3. Frases");
			System.out.println("0. Salir");
			
			String op = sc.nextLine();
			opcion = Integer.parseInt(op);
			
			switch (opcion) {
			case 1:
				Funciones1.menu1(sc);
				break;
			case 2:
				System.out.println("Dime una frase: ");
				String n = sc.nextLine();
				System.out.println(Funciones3.cifradosimple(n));
				System.out.println(Funciones3.contarvocales(n));
				System.out.println(Funciones3.numerosenfrase(n));
				System.out.println(Funciones3.palabracorta(n));
			
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				break;
			}
		} while (opcion != 0);
		
		
	}

}

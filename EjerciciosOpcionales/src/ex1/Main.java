package ex1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		ArrayList listArray = new ArrayList<>();
		LinkedList listaLinked = new LinkedList<>();
		System.out.println("Por Defecto\n");

		long tempsInicial1 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listArray.add(i);
		}
		long tempsFin1 = System.nanoTime();
		System.out.println("ArrayList 10000  : " + (tempsFin1 - tempsInicial1));

		long tempsInicial2 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listaLinked.add(i);
		}
		long tempsFin2 = System.nanoTime();
		System.out.println("LinkedList 10000 : " + (tempsFin2 - tempsInicial2));

		System.out.println("\n En la posicion 0");

		long tempsInicial3 = System.nanoTime();
		listArray.add(0, 100001);
		long tempsFin3 = System.nanoTime();
		System.out.println("ArrayList pos 0   : " + (tempsFin3 - tempsInicial3));

		long tempsInicial4 = System.nanoTime();
		listaLinked.add(0, 100001);
		long tempsFin4 = System.nanoTime();
		System.out.println("LinkedList pos 0 : " + (tempsFin4 - tempsInicial4));

		System.out.println("\n En la posicion 5000");

		long tempsInicial5 = System.nanoTime();
		listArray.add(5000, 100001);
		long tempsFin5 = System.nanoTime();
		System.out.println("ArrayList pos 5000 : " + (tempsFin5 - tempsInicial5));

		long tempsInicial6 = System.nanoTime();
		listaLinked.add(5000, 100001);
		long tempsFin6 = System.nanoTime();
		System.out.println("LinkedList pos 5000 : " + (tempsFin6 - tempsInicial6));

		System.out.println("\n En la posicion 10000");

		long tempsInicial7 = System.nanoTime();
		listArray.add(10000, 100001);
		long tempsFin7 = System.nanoTime();
		System.out.println("ArrayList pos 10000  : " + (tempsFin7 - tempsInicial7));

		long tempsInicial8 = System.nanoTime();
		listaLinked.add(10000, 10000);
		long tempsFin8 = System.nanoTime();
		System.out.println("LinkedList pos 10000 : " + (tempsFin8 - tempsInicial8));

		System.out.println("\n****** GET **********");

		System.out.println("\n En la posicion 0");

		long tempsInicial9 = System.nanoTime();
		listArray.get(0);
		long tempsFin9 = System.nanoTime();
		System.out.println("ArrayList pos 0   : " + (tempsFin9 - tempsInicial9));

		long tempsInicial10 = System.nanoTime();
		listaLinked.get(0);
		long tempsFin10 = System.nanoTime();
		System.out.println("LinkedList pos 0 : " + (tempsFin10 - tempsInicial10));

		System.out.println("\n En la posicion 5000");

		long tempsInicial11 = System.nanoTime();
		listArray.get(5000);
		long tempsFin11 = System.nanoTime();
		System.out.println("ArrayList pos 5000 : " + (tempsFin11 - tempsInicial11));

		long tempsInicial12 = System.nanoTime();
		listaLinked.get(5000);
		long tempsFin12 = System.nanoTime();
		System.out.println("LinkedList pos 5000 : " + (tempsFin12 - tempsInicial12));

		System.out.println("\n En la posicion 10000");

		long tempsInicial13 = System.nanoTime();
		listArray.get(10000);
		long tempsFin13 = System.nanoTime();
		System.out.println("ArrayList pos 10000  : " + (tempsFin13 - tempsInicial13));

		long tempsInicial14 = System.nanoTime();
		listaLinked.get(10000);
		long tempsFin14 = System.nanoTime();
		System.out.println("LinkedList pos 10000 : " + (tempsFin14 - tempsInicial14));

		/*
		 * Exercici 2. Quina estructura de dades utilitzaries per cada un dels
		 * següents casos? -
		 *
		 * Una llista amb molts elements en la que es
		 * realitzen moltes insercions i aquestes es produeixen sempre per
		 * posició absoluta. 
		 * 
		 * linkedlist
		 * 
		 * - Una llista en la que es volen eliminar elements
		 * sempre en comparació un altre element donat 
		 * 
		 * linkedlist
		 * 
		 * - Una llista en la què
		 * constanment accedirem als elements per posició absoluta.
		 * 
		 * ArrayList
		 * 
		 * Exercici 3. - Ocupen més espai d'emmagatzematge les llistes que els
		 * vectors de la mateixa mida? - Perquè no necessitem iteradors pel
		 * vectors?
		 * El vector no necesita iterator porque el que se agrega y se extraer el último siempre (LIFO)
		 * 
		 * 
		 */
	}

}

//Imprimir números del 1 al 10

package practicar;

import java.util.Scanner;

public class Practicar01 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaro las variables que voy a usar
		int i;
		
		//Creo un bucle que genere los numeros del 1 al 10
		for(i = 1; i < 11; i++) {
		System.out.println(i);
		
		sc.close();	
		}
				
	}

}

/* Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
 * A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, 
 * a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
 * El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
 * si se llega al limite de intentos te muestra el número que había generado.*/

package practicar;

import java.util.Scanner;

public class Practicar09 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables
		int numRand;
		int num;
		int counter = 10;
		int attempt = 1;
		
		//We explain to the user how this program works
		System.out.println("Try to guess the number from 1 to 100");
		
		//We take a random number between 1 and 100
		numRand = (int) (Math.random() * 100+1);
		
		//We create a loop
		do {
			System.out.print("You have " + counter + " attempts: ");
			num = sc.nextInt();
			if(numRand > num) {
				System.out.println("You failed!!! The random number is bigger than " + num);
			}
			else if(numRand < num) {
				System.out.println("You failed!!! The random number is smaller than " + num);
			}
			else {
				System.out.println("You guessed it on your " + attempt + "º attempt");
			}
			
			counter--;
			attempt++;
		}
		while(counter > 0 && num != numRand);
		
		if (counter == 0) {
			System.out.println("The Random number was " + numRand);
		}
		
		//We close the scanner
		sc.close();
		
	}
}
		
		

	




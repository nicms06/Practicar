/*
 * Pide 10 números al usuario y muestra cuántos son pares y cuántos impares.
 */

package practicar;

import java.util.Scanner;

public class Practicar09 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare Variables
		int n;
		int i;
		int even = 0;
		int odd = 0;
		
		//We create a loop to input 10 numbers
		for ( i = 1 ; i < 11 ; i++) {
			System.out.print("Input the number " + i + ": ");
			n = sc.nextInt();
			
			if (n%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			//Close the Scanner
			sc.close();
		}
		
		//Show the results 
		System.out.println("There are " + even + " even numbers and " + odd + " odd numbers");

	}

}

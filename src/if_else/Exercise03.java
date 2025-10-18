/*
 * Pide el monto de una compra:
 * Si es menor de 100, sin descuento.
 * Si está entre 100 y 500, 10% de descuento.
 * Si es mayor de 500, 20% de descuento.
 * Muestra el total a pagar.
 */

package if_else;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double price;
		double finalPrice;
		double discount;
		
		//Ask the user for how much he has to pay
		System.out.println("Please input the price: ");
		price = sc.nextDouble();
		
		//The logic of the exercise
		if (price < 100) {
			discount = 0;
		}
		else if (price >= 100 && price <=500) {
			discount = 10;
		}
		else {
			discount = 20;
		}
		
		//Calculate the final price
		finalPrice = price * (1 - (discount/100));
		
		//Show the result
		System.out.printf("You have to pay : %.2f\n", finalPrice);
		
		//Close the Scanner
		sc.close();

	}

}

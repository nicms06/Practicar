//Suma de números del 1 al n. Pide al usuario un número n y calcula la suma de todos los números desde 1 hasta n.

package practicar;

import java.util.Scanner;

public class Practicar02{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaro las variable n que será el número que le pediremos al usuario
		int n;
		
		//La variable i será la que usaremos para crear el bucle
		int i;
		
		//Esta variable será la suma de todos los números (toda la suma)
		int sol = 0;
		
		//Le pido al usuario un número
		System.out.println("Introduzca un valor mayor que 0: ");
		n = sc.nextInt();
		
		//Hago un buble para asegurarme que el usuario escribe un número mayor a 0
		while(n<=0) {
			
			System.out.println("El número debe de ser mayor que 0, inténtelo de nuevo: ");
			n = sc.nextInt();
		}
		
		sc.close();
		
		for(i = 0; i <= n; i++) {	
			sol += i ;
		}
		
		System.out.println("La suma de todos los numeros hasta " + n + " es: " + sol);
				
	}

}


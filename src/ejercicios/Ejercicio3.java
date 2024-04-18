	package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		int edad;
		double peso;
		
		System.out.println("Ingrese la edad: ");
		edad = sc.nextInt();
		
		System.out.println("Ingrese el peso: ");
		peso = sc.nextDouble();
		
		System.out.println("La edad es "+edad+" y el peso es " + peso);
	}
	
}

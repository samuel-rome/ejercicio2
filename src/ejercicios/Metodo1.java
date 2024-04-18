package ejercicios;

public class Metodo1 {
	//Metodo
	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	//Public
	
	public static void main(String[] args) {
		
		Metodo1 miSumador = new Metodo1();
		
		int resultado = miSumador.sumar(5, 3);
		
		System.out.println("La suma es: " + resultado);
	}
}

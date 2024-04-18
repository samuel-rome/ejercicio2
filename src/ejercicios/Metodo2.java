package ejercicios;

public class Metodo2 {
	
	public int areaT(int base, int altura) {
		
		int resultado = (base * altura) / 2 ;
		
		if(resultado < 0 ) {
			System.out.println("El resultado es negativo");
		} else{
			System.out.println("El resultado es positivo");
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		
		Metodo2 calcularArea = new Metodo2();
				
		int resultado = calcularArea.areaT(5, -1);
		
		System.out.println("El area del triangulo es: " + resultado);
		
		
	}
}

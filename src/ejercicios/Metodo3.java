package ejercicios;

public class Metodo3 {

    public static void main(String[] args) {
        // Sueldo bruto mensual
        int sbm = 5500;

        // Utilidad por persona al año
        int upa = 3500;

        // Salarios anuales
        int sa = 14;

        // Unidad Impositiva Tributaria
        int uit = 3600;

        // Calcular el impuesto
        int impuesto = calcularImpuesto(sbm, upa, sa, uit);

        // Imprimir el resultado del impuesto
        if (impuesto > 0) {
            System.out.println("Su impuesto es de " + impuesto);
        } else {
            System.out.println("El impuesto es 0");
        }
    }
    
    public static int calcularImpuesto(int sbm, int upa, int sa, int uit) {
        return ((((sbm * sa) + upa) - (uit * 7)) * 21) / 100;
    }
}

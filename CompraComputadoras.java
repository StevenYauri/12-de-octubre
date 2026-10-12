import java.util.Scanner;

public class CompraComputadoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = entrada.nextInt();
        
        double precioUnitario = 2500.0;
        double importe = cantidad * precioUnitario;
        double porcentajeDescuento;
        
        if (cantidad >= 5) {
            porcentajeDescuento = 0.12; // 12%
        } else {
            porcentajeDescuento = 0.05; // 5%
        }
        
        double descuento = importe * porcentajeDescuento;
        double total = importe - descuento;
        
        System.out.println("Importe bruto: S/" + importe);
        System.out.println("Descuento (" + (porcentajeDescuento * 100) + "%): S/" + descuento);
        System.out.println("Total a pagar: S/" + total);
        
        entrada.close();
    }
}

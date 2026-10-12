import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia recorrida (km): ");
        double distancia = entrada.nextDouble();
        double montoPagar;
        
        if (distancia <= 3) {
            montoPagar = 8.0;
        } else {
            double kmAdicionales = distancia - 3;
            montoPagar = 8.0 + (kmAdicionales * 2.50);
        }
        
        System.out.println("El total a pagar es: S/" + montoPagar);
        
        entrada.close();
    }
}

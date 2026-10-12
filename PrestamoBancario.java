import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su sueldo mensual (S/): ");
        double sueldo = entrada.nextDouble();
        double prestamoMaximo;
        
        if (sueldo >= 3000) {
            prestamoMaximo = sueldo * 5;
        } else {
            prestamoMaximo = sueldo * 2;
        }
        
        System.out.println("Usted califica para un préstamo máximo de: S/" + prestamoMaximo);
        
        entrada.close();
    }
}

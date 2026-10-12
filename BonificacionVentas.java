import java.util.Scanner;

public class BonificacionVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el monto total de ventas (S/): ");
        double ventas = entrada.nextDouble();
        
        double porcentajeBono;
        
        if (ventas > 5000) {
            porcentajeBono = 0.10; // 10%
        } else {
            porcentajeBono = 0.05; // 5%
        }
        
        double bonificacion = ventas * porcentajeBono;
        double total = ventas + bonificacion;
        
        System.out.println("Monto de bonificación: S/" + bonificacion);
        System.out.println("Monto total (Ventas + Bono): S/" + total);
        
        entrada.close();
    }
}

import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = entrada.nextDouble();
        
        if (peso <= 50) {
            System.out.println("Paquete aceptado. Su peso está dentro del límite permitido.");
        } else {
            double exceso = peso - 50;
            System.out.println("Paquete rechazado.");
            System.out.println("Sobrepasa el límite por: " + exceso + " kg.");
        }
        
        entrada.close();
    }
}

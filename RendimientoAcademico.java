import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el promedio del estudiante (0 - 20): ");
        double promedio = entrada.nextDouble();
        
        // Validación del rango de la nota
        if (promedio < 0 || promedio > 20) {
            System.out.println("Error: El promedio ingresado no es válido.");
        } else if (promedio < 11) {
            System.out.println("Condición: Desaprobado");
        } else if (promedio <= 14) {
            System.out.println("Condición: Regular");
        } else if (promedio <= 17) {
            System.out.println("Condición: Bueno");
        } else {
            System.out.println("Condición: Excelente");
        }
        
        entrada.close();
    }
}

import java.util.Scanner;

public class SistemaPagoEmpleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el salario bruto base del empleado (S/): ");
        double salarioBruto = entrada.nextDouble();
        
        System.out.print("Ingrese las horas totales trabajadas: ");
        int horas = entrada.nextInt();
        
        // 1. Calcular el impuesto según el salario bruto
        double porcentajeImpuesto;
        if (salarioBruto > 2500) {
            porcentajeImpuesto = 0.12; // 12%
        } else {
            porcentajeImpuesto = 0.07; // 7%
        }
        double impuesto = salarioBruto * porcentajeImpuesto;
        
        // 2. Calcular el bono por horas trabajadas
        double bono = 0.0;
        if (horas > 48) {
            bono = 300.0;
        }
        
        // 3. Calcular el salario neto final
        double salarioNeto = salarioBruto - impuesto + bono;
        
        // Mostrar resultados
        System.out.println("\n--- BOLETA DE PAGO RESUMEN ---");
        System.out.println("Salario Bruto: S/" + salarioBruto);
        System.out.println("Impuesto (" + (porcentajeImpuesto * 100) + "%): S/" + impuesto);
        System.out.println("Bono por Horas Extras: S/" + bono);
        System.out.println("------------------------------");
        System.out.println("Salario Neto a Pagar: S/" + salarioNeto);
        
        entrada.close();
    }
}

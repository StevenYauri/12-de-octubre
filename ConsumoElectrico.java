import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el consumo de energía (kWh): ");
        double kwh = entrada.nextDouble();
        double montoPagar;
        
        if (kwh <= 100) {
            montoPagar = kwh * 0.80;
        } else {
            montoPagar = kwh * 1.20;
        }
        
        System.out.println("El monto total a pagar es: S/" + montoPagar);
        
        entrada.close();
    }
}

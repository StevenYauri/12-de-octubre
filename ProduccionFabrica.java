import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezas = entrada.nextInt();
        
        double precioPorPieza = 5.0;
        double importeBruto = piezas * precioPorPieza;
        double porcentajeIncentivo;
        
        if (piezas > 1000) {
            porcentajeIncentivo = 0.15; // 15%
        } else {
            porcentajeIncentivo = 0.08; // 8%
        }
        
        double incentivo = importeBruto * porcentajeIncentivo;
        double totalAPagar = importeBruto + incentivo;
        
        System.out.println("Importe bruto por piezas: S/" + importeBruto);
        System.out.println("Incentivo asignado (" + (porcentajeIncentivo * 100) + "%): S/" + incentivo);
        System.out.println("Total final a pagar: S/" + totalAPagar);
        
        entrada.close();
    }
}

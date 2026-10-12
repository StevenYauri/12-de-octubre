import java.util.Scanner;

public class SalarioHorasExtras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas: ");
        int horas = entrada.nextInt();
        double salarioTotal;
        
        if (horas <= 40) {
            salarioTotal = horas * 20;
        } else {
            int horasNormales = 40;
            int horasExtras = horas - 40;
            salarioTotal = (horasNormales * 20) + (horasExtras * 20 * 2);
        }
        
        System.out.println("El salario total es: S/" + salarioTotal);
        entrada.close();
    }
}

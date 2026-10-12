import java.util.Scanner;

public class ComparacionTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double n2 = entrada.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double n3 = entrada.nextDouble();
        
        double mayor, menor;
        
        // Determinar el número mayor
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        // Determinar el número menor
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        
        // Calcular la diferencia
        double diferencia = mayor - menor;
        
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Diferencia (mayor - menor): " + diferencia);
        
        entrada.close();
    }
}

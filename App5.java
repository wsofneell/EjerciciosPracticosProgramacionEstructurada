import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, digito;
        int suma = 0;

        System.out.print("Ingresa un número entero: ");
        numero = lector.nextInt();
        
        do {
            digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        } while (numero != 0);

        System.out.println("La suma de los dígitos es: " + suma);

        lector.close();
    }
}
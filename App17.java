import java.util.Scanner;

public class App17 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroArticulo;
        double[] valoresArticulos = {239.99, 129.75, 99.95, 350.89};
        double ingresos = 0.0; 

        while (true) {
            System.out.print("Ingrese el numero del artículo vendido (-1 para finalizar): ");
            numeroArticulo = lector.nextInt();

            if (numeroArticulo == -1) {
                break;
            }

            if (numeroArticulo >= 1 && numeroArticulo <= valoresArticulos.length) {
                ingresos += valoresArticulos[numeroArticulo - 1]; 
            } else {
                System.out.println("Numero de articulo no valido. Intente de nuevo.");
            }
        }
        ingresos = 200 + (0.09 * ingresos); 
        System.out.println("Los ingresos del vendedor son: C$" + ingresos);

        lector.close();
    }
}

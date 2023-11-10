import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nCuenta, nCanalesPremium;
        int  nConexiones = 0;
        double importeFactura= 0;
        char codigoCliente;
        
        System.out.println("Ingrese el numero de cuenta del cliente:");
        nCuenta = lector.nextInt();
        System.out.println("Ingrese el codigo de cliente (R/N):");
        codigoCliente = lector.next().charAt(0);
        System.out.println("Ingrese el numero de canales Premium:");
        nCanalesPremium = lector.nextInt();
        
        if(codigoCliente == 'N' || codigoCliente == 'n') {
            System.out.println("Ingrese el numero de conexiones de servicio basico:");
            nConexiones = lector.nextInt();
        }
        
        if (codigoCliente == 'R' || codigoCliente == 'r') {
            
            importeFactura = 4.50 + 20.50 + 7.50 * nCanalesPremium;
        } else if (codigoCliente == 'N' || codigoCliente == 'n') {
        
            if (nConexiones <= 10) {
                importeFactura = 15.00 + 75.00 + 50.00 * nCanalesPremium;
            } else {
                importeFactura = 15.00 + 75.00 + 5.00 * (nConexiones - 10) + 50.00 * nCanalesPremium;
            }
        }
        
        System.out.println("Número de cuenta: " + nCuenta);
        System.out.println("Importe de facturación: " + importeFactura);

        lector.close();
    }
}
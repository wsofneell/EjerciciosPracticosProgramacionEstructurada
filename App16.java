import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int nCuenta, balanceInicial, cargoTotal, creditoTotal, limiteCredito, nuevoBalace;

            System.out.println("Ingrese el numero de cuenta del cliente:");
            nCuenta = lector.nextInt();
            System.out.println("Ingrese el saldo inicial del cliente:");
            balanceInicial = lector.nextInt();
            System.out.println("Ingrese el monto total de todos los articulos cobrados por el cliente en el mes:");
            cargoTotal = lector.nextInt();
            System.out.println("Ingrese el monto total de todos los creditos aplicados a la cuenta del cliente en el mes:");
            creditoTotal = lector.nextInt();
            System.out.println("Ingrese el limite de credito del cliente:");
            limiteCredito = lector.nextInt();
        
            nuevoBalace = balanceInicial + cargoTotal - creditoTotal;

            System.out.println("El nuevo saldo del cliente es: " + nuevoBalace);
            System.out.println("El numero de cuenta del cliente es: " + nCuenta);
        
        if (nuevoBalace > limiteCredito) {
            System.out.println("Se ha superado el límite de crédito del cliente..");
        }

        lector.close();
    }
}
    


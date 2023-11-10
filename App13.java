import java.util.Scanner;

public class App13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double saldoCordobas = 0;
        double saldoDolares = 0;
        int intentoMaximo = 3;
        int intentos = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n*** Menú de Cajero Automático ***");
            System.out.println("1. Consultar Saldo de la cuenta : ");
            System.out.println("2. Retirar dinero de la cuenta : ");
            System.out.println("3. Depositar :  ");
            System.out.println("4. Imprimir esatdo de la cuenta : ");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción en un rango de 1 a 5 : ");

            int seleccion = lector.nextInt();

            switch (seleccion) {
                case 1:
                    consultarSaldo(saldoCordobas, saldoDolares);
                    break;
                case 2:
                    realizarRetiro(saldoCordobas, saldoDolares);
                    break;
                case 3:
                    realizarDeposito(saldoCordobas, saldoDolares);
                    break;
                case 4:
                    imprimirSaldos(saldoCordobas, saldoDolares);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo con un caracter correcto .");
            }
        }
        if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }
      
        intentos++;
      
        if(intentos == intentoMaximo){
            System.out.println("No le quedan mas intentos ");
            System.out.println("Gracias por utilizar el Cajero Automático ATM.");
        }
        lector.close();        
    }

    public static void consultarSaldo(double saldoCordoba, double saldoDolar) {
        System.out.println("\nSaldo en Córdobas: C$" + saldoCordoba);
        System.out.println("Saldo en Dólares: $" + saldoDolar);
    }

    public static void realizarRetiro(double saldoCordoba, double saldoDolar) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Seleccione la cuenta (C para Córdobas, D para Dólares): ");
        char cuenta = lector.next().charAt(0);

        if (cuenta == 'C' || cuenta == 'c') {
            System.out.print("ingrese el Monto a retirar en Córdobas: C$");
            double monto = lector.nextDouble();

            if (monto <= saldoCordoba) {
                saldoCordoba -= monto;
                System.out.println("¡Felicidades su Retiro fue exitoso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else if (cuenta == 'D' || cuenta == 'd') {
            System.out.print("Monto a retirar en Dólares: $");
            double monto = lector.nextDouble();

            if (monto <= saldoDolar) {
                saldoDolar -= monto;
                System.out.println("Retiro exitoso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Cuenta invalida.");
        }
        lector.close();
    }

    public static void realizarDeposito(double saldoCordoba, double saldoDolar) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Seleccione la cuenta (C para Córdobas, D para Dólares): ");
        char cuenta = lector.next().charAt(0);

        if (cuenta == 'C' || cuenta == 'c') {
            System.out.print("Monto a depositar en Córdobas: C$");
            double monto = lector.nextDouble();

            saldoCordoba += monto;
            System.out.println("Depósito exitoso.");
        } else if (cuenta == 'D' || cuenta == 'd') {
            System.out.print("Monto a depositar en Dólares: $");
            double monto = lector.nextDouble();
            saldoDolar += monto;
            System.out.println("¡Felicidades su deposito fue exitoso!.");
        } else {
            System.out.println("Cuenta inválida.");
        }
        lector.close();
        
    }

    public static void imprimirSaldos(double saldoCordoba, double saldoDolar) {
        System.out.println("\nSaldo en Córdobas: C$" + saldoCordoba);
        System.out.println("Saldo en Dólares: $" + saldoDolar);
    }
}

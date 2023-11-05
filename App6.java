import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de cuenta: ");
        int ncuenta = lector.nextInt();
    
        System.out.print("Ingrese el tipo de cuenta: (S/s para ahorros o C/c para cheques): ");
        char TipoCuenta = lector.next().charAt(0);
        
        System.out.print("Ingrese el saldo minimo: ");
        double saldoMinimo = lector.nextDouble();
        
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = lector.nextDouble();

        Double saldoNuevo = saldoActual;
        if (saldoActual < saldoMinimo) {
            
            if (TipoCuenta == 'S' || TipoCuenta == 's') {
                saldoNuevo -= 10;
            } else if (TipoCuenta == 'C' || TipoCuenta == 'c') {
                saldoNuevo -= 25;
            }
        } else {
            if (TipoCuenta == 'S' || TipoCuenta == 's') {
                saldoNuevo += saldoActual * 0.04;
            } else if (TipoCuenta == 'C' || TipoCuenta == 'c') {
                if (saldoActual <= 5000 + saldoMinimo) {
                    saldoNuevo += saldoActual * 0.03;
                } else {
                    saldoNuevo += saldoActual * 0.05;
                }
            }
        }
       
        System.out.println("Numero de cuenta: " + ncuenta);
        System.out.println("Tipo de cuenta: " + TipoCuenta);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Saldo nuevo: " + saldoNuevo);

        lector.close();
    }        
}
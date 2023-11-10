import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner lector  = new Scanner(System.in);
        double montoPrestamo,tasaInteresAnual,tasaInteresMensual, pagoCapital, pagoMensual;
        int meses = 0;
        
        System.out.print("Monto del préstamo (en C$): ");
        montoPrestamo = lector.nextDouble();
        System.out.print("Tasa de interés anual (%): ");
        tasaInteresAnual = lector.nextDouble();
        System.out.print("Pago mensual (en C$): ");
        pagoMensual = lector.nextDouble();

        tasaInteresMensual = (tasaInteresAnual / 12) / 100;
                
        while (montoPrestamo > 0) {

            double interesMensual = montoPrestamo * tasaInteresMensual;
    
            pagoCapital = pagoMensual - interesMensual;
            montoPrestamo = pagoCapital;
                      
            if (pagoMensual <= interesMensual) {
                System.out.println("El pago mensual es demasiado bajo. El préstamo nunca se pagará.");
                break;
            }
            meses++;

            if (montoPrestamo <= 0) {
                break;
            }
        }

        if (montoPrestamo <= 0) {
            System.out.println("Se pagarán completamente el préstamo en " + meses + " meses.");
        }
        lector.close();
    }
}

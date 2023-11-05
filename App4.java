import java.util.Scanner;

public class App4 {
    public static void main(String []args){
        Scanner lector=new Scanner(System.in);
        double raiz1, raiz2, raiz;
        double a, b, c, discriminante, nReal, nCompleja;
         
        System.out.print(" ingrese el valor a: ");
        a = lector.nextDouble();
        System.out.print("ingrese el valor de b: ");
        b = lector.nextDouble();
        System.out.print("ingrese el valor de c: ");
        c = lector.nextDouble();

        discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces son reales :");
            System.out.println(" Ecuacion cuadratica con simbolo +  = " + raiz1);
            System.out.println("Ecuaciion cuadratica con simbolo -  = " + raiz2);
        } else if (discriminante == 0) {
            raiz = - b / (2 * a);

            System.out.println("La ecuación tiene una sola raíz: ");
            System.out.println("Raíz = " + raiz);
        } else {
            nReal = -b / (2 * a);
            nCompleja = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("La Ecuacion posee dos raices complejas: ");
            System.out.println("Raíz 1 = " + nReal + " + " + nCompleja);
            System.out.println("Raíz 2 = " + nReal + " - " + nCompleja);
        }
        
     lector.close();
    }
}
    

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        char genero, armas;
        
        System.out.println("Ingresa tu edad");
        edad = lector.nextInt();

        System.out.println("Ingresa tu género: H/M");
        genero = lector.next().charAt(0);
        
        if (edad < 18) {
            System.out.println("Usted no puede entrar a este local.");
        } else if (genero == 'M' && genero == 'm') {
                
                if (edad >= 20) {
                    System.out.println("Usted puede entrar a este local y consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Usted puede entrar a este local, pero no puedes consumir bebidas alcohólicas.");
                }
        } else if(genero == 'H' && genero == 'h') {
            System.out.println("Usted porta armas? S/N");
            armas = lector.next().charAt(0);

            if (armas == 'S' && armas == 's') {
                System.out.println("Usted no puede entrar a este local.");
            } else {
        
                if (edad >= 20) {
                    System.out.println("Usted puede entrar a este local y consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Usted puede entrar a este local, pero no puedes consumir bebidas alcohólicas.");
                }
            }
            
        }
        
        lector.close();
    }
    
}
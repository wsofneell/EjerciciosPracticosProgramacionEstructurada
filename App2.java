import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double longLado1,longLado2,longLado3;
        
        System.out.println("Ingrese la longitud del primer lado del triángulo: ");
        longLado1 = lector.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
        longLado2 = lector.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
        longLado3 = lector.nextDouble();
        
        if (longLado1 + longLado2 > longLado3 && longLado2 + longLado3 > longLado1 && longLado1 + longLado3 > longLado2) {
    
            if (longLado1 == longLado2 && longLado2 == longLado3) {
                System.out.println("El triángulo es equilátero");
            } else if (longLado1 == longLado2 || longLado2 == longLado3 || longLado1 == longLado3) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
        } else {
            
            System.out.println("No se puede formar un triángulo con los valores ingresados.");
        }
        
        lector.close();
    }
}

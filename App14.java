import java.util.Scanner;

public class App14 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int litros, kilometros;
        double total;
         
        do{
        System.out.println("Cuantos litros de combustible uso?");
        litros = lector.nextInt();
        }while(litros <=0 || litros > 100);

        do{
            System.out.println("Cuantos kilometros recorrio");
            kilometros = lector.nextInt();
        }while(kilometros <= 0 || kilometros > 500);

        total = litros / kilometros * 100;

        System.out.println("Los kilometros por litro son " + total);


        lector.close();
    }
    
}

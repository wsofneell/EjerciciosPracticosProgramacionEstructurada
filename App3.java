import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Double nCajas, nContenedores, nRosquillas, nCajasSobrantes, nRosquillasSobrantes;

        do{
        System.out.println("Ingrese el número total de rosquillas:");
        nRosquillas = lector.nextDouble();
        } while (nRosquillas <= 0);

        nCajas = nRosquillas / 24;
        nContenedores = nCajas / 75;
        nRosquillasSobrantes = nRosquillas * 0.24;

        if (nRosquillasSobrantes > 0) {
            nCajas--;
        }
        
        nCajasSobrantes = nCajas * 0.75;
        if (nCajasSobrantes > 0) {
            nContenedores--;
        }
        
        System.out.println("Número de cajas necesarias: " + nCajas);
        System.out.println("Número de contenedores necesarios: " + nContenedores);
        System.out.println("Número de rosquillas sobrantes: " + nRosquillasSobrantes);
        System.out.println("Número de cajas sobrantes: " + nCajasSobrantes);

        lector.close();
    }
}
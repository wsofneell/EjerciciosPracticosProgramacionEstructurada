import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); 
        char tipoMarco, colorMarco;
        Double longitud, ancho, area, costoTotal, costoMarco, costoCarton, costoVidrio;
        Double costoPinturaPorPulgada = 0.10;
        Double costoMarcoRegular = 0.15; 
        Double costoMarcoLujo = 0.25;
        Double costoCartonPorPulgadaCuadrada = 0.2;
        Double costoVidrioPorPulgadaCuadrada = 0.7;
        Double costoCoronas = 0.35;

        System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
        longitud = lector.nextDouble();
        System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
        ancho = lector.nextDouble();
        System.out.print("Elija el tipo de marco (r para regular o l para lujoso): ");
        tipoMarco = lector.next().charAt(0);
        System.out.print("Elija el color del marco: ");
        colorMarco = lector.next().charAt(0);

        Double costoMarcoPorPulgada;

        if (tipoMarco == 'r' || tipoMarco == 'R') {
            costoMarcoPorPulgada = 0.15;
        } else if (tipoMarco == 'l' || tipoMarco == 'L' ) {
            costoPinturaPorPulgada = 0.25;
        } else {
            System.out.println("Tipo de marco no válido. Utilizando marco regular por defecto.");
            costoMarcoRegular = 0.15;
        }

        area = longitud * ancho;
        costoMarco = (longitud + ancho) * 2 * costoMarcoPorPulgada;

        System.out.print("Desea agregar corona (S/N): ");
        char respuestaCoronas = lector.next().charAt(0);

        if (respuestaCoronas == 'S') {
            System.out.print("Ingrese el número de coronas: ");
            int nCoronas = lector.nextInt();
            costoCoronas = nCoronas * 0.35;
        }

         costoCarton = area * costoCartonPorPulgadaCuadrada;
         costoVidrio = area * costoVidrioPorPulgadaCuadrada;
         costoTotal = costoMarco + costoPinturaPorPulgada * (longitud + ancho) * 2 + costoCoronas + costoCarton + costoVidrio;

        System.out.println("El costo total de enmarcar la fotografía es: $" + costoTotal);

        lector.close();
    }
}


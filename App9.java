import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int valor1, valor2, nParSuma, CuadradoImparSuma, ncuadrado;
        int intentos = 1;
        int intentoMaximo = 3;

        System.out.print("Ingrese el primer número: ");
        valor1 = lector.nextInt();
        System.out.print("Ingrese el segundo número : ");
        valor2 = lector.nextInt();

        nParSuma = 0;
        CuadradoImparSuma = 0;

        while (valor1 < valor2) {
            System.out.println("Número: " + valor1);
            ncuadrado = valor1 * valor1;
            System.out.println("Cuadrado: " + ncuadrado);

            if (valor1 % 2 != 0) {
                CuadradoImparSuma = CuadradoImparSuma + ncuadrado;
                System.out.println("Es impar.");
            }

            if (valor1 % 2 == 0) {
                nParSuma += valor1;
                System.out.println("Es par.");
            }

            esNumeroPerfecto(valor1);
            esNumeroPrimo(valor1);

            valor1 = valor1 + 1;

        }
        if(intentos < 3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }

      intentos++;
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }
        System.out.println("Suma de números pares: " + nParSuma);
        System.out.println("Suma de cuadrados de números impares: " + CuadradoImparSuma);

        lector.close();
    }

    public static void esNumeroPerfecto(int num) {
        if (num <= 1) {
            System.out.println(num + " no es perfecto.");
        } else {
            int sumaDivisores = 0;
            int contador = 1;
             int esPerfecto = 0;
            while (contador < num) {
                if (num % contador == 0) {
                    sumaDivisores += contador;
                }
                contador= contador + 1;
            }
            if (sumaDivisores == num) {
                esPerfecto = num;
            }
            if (esPerfecto != 0) {
                System.out.println(esPerfecto + " es perfecto.");
            }
        }
    }

    public static void esNumeroPrimo(int num) {
        if (num <= 1) {
            System.out.println(num + " no es primo.");
        } else {
            int contadorDivisores = 0;
            int contador = 2;
            while (contador <= Math.sqrt(num)) {
                if (num % contador == 0) {
                    contadorDivisores++;
                }
                contador = contador+1;
            }
            if (contadorDivisores == 0) {
                System.out.println(num + " es primo.");
            }
        }
    }
}
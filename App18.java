import java.util.Scanner;

public class App18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Triángulo equilátero");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectángulo");
        System.out.println("5. Paralelogramo");
        System.out.println("6. Rombo");
        System.out.println("7. Círculo");
        System.out.println("8. Trapecio");
        System.out.println("9. Pentágono");
        System.out.println("10. Elipse");
        System.out.print("Ingrese el número de la figura deseada: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                dibujarTrianguloRectangulo();
                break;
            case 2:
                dibujarTrianguloEquilatero();
                break;
            case 3:
                dibujarCuadrado();
                break;
            case 4:
                dibujarRectangulo();
                break;
            case 5:
                dibujarParalelogramo();
                break;
            case 6:
                dibujarRombo();
                break;
            case 7:
                dibujarCirculo();
                break;
            case 8:
                dibujarTrapecio();
                break;
            case 9:
                dibujarPentagono();
                break;
            case 10:
                dibujarElipse();
                break;
            default:
                System.out.println("Opción no válida");
        }

        lector.close();
    }

    public static void dibujarTrianguloRectangulo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo rectángulo: ");
        int altura = lector.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        lector.close();
    }

    public static void dibujarTrianguloEquilatero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo equilátero: ");
        int altura = lector.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        lector.close();
    }
    

    public static void dibujarPentagono() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la longitud de un lado del pentágono: ");
        int longitudLado = lector.nextInt();
        
        int numLados = 5;

        for (int i = 1; i <= numLados; i++) {
            for (int j = 1; j <= longitudLado; j++) {
                System.out.print("* ");
            }
             System.out.println();
        }
        lector.close();
    }
    

    public static void dibujarCuadrado() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        int lado = lector.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        lector.close();
    }
    
    public static void dibujarRectangulo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectángulo: ");
        int ancho = lector.nextInt();
        System.out.print("Ingrese la altura del rectángulo: ");
        int altura = lector.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        lector.close();
    }

    public static void dibujarParalelogramo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la base del paralelogramo: ");
        int base = lector.nextInt();
        System.out.print("Ingrese la altura del paralelogramo: ");
        int altura = lector.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        lector.close();
    }
    
    public static void dibujarRombo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la mitad de la diagonal mayor del rombo: ");
        int mitadDiagonalMayor = lector.nextInt();

        for (int i = 1; i <= mitadDiagonalMayor; i++) {
            for (int j = 1; j <= mitadDiagonalMayor - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mitadDiagonalMayor - 1; i >= 1; i--) {
            for (int j = 1; j <= mitadDiagonalMayor - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        lector.close();
    }

    public static void dibujarCirculo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        int radio = lector.nextInt();

        for (int i = -radio; i <= radio; i++) {
            for (int j = -radio; j <= radio; j++) {
                if (i * i + j * j <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        lector.close();
    }
    
        
    public static void dibujarTrapecio() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la base mayor del trapecio: ");
        int baseMayor = lector.nextInt();
        System.out.print("Ingrese la base menor del trapecio: ");
        int baseMenor = lector.nextInt();
        System.out.print("Ingrese la altura del trapecio: ");
        int altura = lector.nextInt();

        int espacio = (baseMayor - baseMenor) / 2;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= espacio; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= baseMenor; j++) {
                System.out.print("*");
            }
            System.out.println();
            espacio--;
            baseMenor += 2; 
        }
        System.out.println();
        lector.close();
    }


        
    public static void dibujarElipse() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el semieje mayor de la elipse: ");
        int semiejeMayor = lector.nextInt();
        System.out.print("Ingrese el semieje menor de la elipse: ");
        int semiejeMenor = lector.nextInt();

        for (int i = -semiejeMenor; i <= semiejeMenor; i++) {
            for (int j = -semiejeMayor; j <= semiejeMayor; j++) {
                if (((double) i * i / (semiejeMenor * semiejeMenor) + (double) j * j / (semiejeMayor * semiejeMayor)) <= 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

           lector.close();
        }
    }
}

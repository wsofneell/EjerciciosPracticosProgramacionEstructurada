import java.util.Scanner;

public class App15{
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int horaT,horaExtra;
        double salario, salarioInicial, inss,pagoExtra, salarioPostInss, salarioBruto;
    
        do{
        System.out.println("Cuantas horas trabajo en la semana?");
        horaT = lector.nextInt();
        }while(horaT <= 0 || horaT > 40);

        do{
        System.out.println("Cuanto se le paga por hora?");
        salario = lector.nextDouble();
        }while(salario <= 0 || salario > 100);
        
        do{
          System.out.println("Cuantas hora extra hizo?");
          horaExtra = lector.nextInt();
        }while(horaExtra <= 0 || horaExtra > 40);

        salarioInicial = salario * horaT;
        pagoExtra = salario * 2;
        salarioPostInss = salarioInicial + pagoExtra;
        inss = salarioPostInss * 0.07;
        salarioBruto = salarioPostInss - inss;

        System.out.println("Su salario semanal es  " + salarioInicial);
        System.out.println("Su salario mas las horas extra es " + salarioPostInss);
        System.out.println("Su salario despues del inss es " + inss);
        System.out.println("Su salario bruto es " + salarioBruto);

        lector.close();
    }
}
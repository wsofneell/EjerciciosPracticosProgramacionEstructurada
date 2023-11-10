import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {
      Scanner lector = new Scanner(System.in);    
      char sexo;
      double A1, A2, A3, A4, A5, B;
      double pesoC_kg, pesoC_Lb,grasaC_LB, grasaC_kg ;
      double mCintura, mCadera, mAntebrazo, mMuneca;
      double pGrasaCorporalkg;
      double pGrasaCorporalLb;
      //m = medida, g = grasa, p = porcentaje;

      System.out.println("Cual es su sexo H/M ");
      sexo = lector.next().charAt(0);

      switch (sexo) {
        case 'M':
        case 'm':

            System.out.println("Cual es su peso corporal en kg");
            pesoC_kg = lector.nextDouble();
            A1= (pesoC_kg * 0.732) + 8.987;

            System.out.println("Cual es la medida de su muneca (en el punto mas amplio): ");
            mMuneca = lector.nextDouble();
            A2 = mMuneca / 3.140;

            System.out.println("Cual es la medida de su cintura (en el ombligo)");
            mCintura = lector.nextDouble();
            A3 = mCintura * 0.157;
          
            System.out.println("Cual es la medida de la cadera (en el punto mas amplio)");
            mCadera = lector.nextDouble();
            A4 = mCadera * 0.249;

            System.out.println("Mediada del antebrazo (en el punto mas amplio)");
            mAntebrazo = lector.nextDouble();
            A5 = mAntebrazo * 0.434;

            B = A1 + A2 - A3 - A4 + A5;
            grasaC_kg = pesoC_kg - B ;
            pGrasaCorporalkg = (grasaC_kg * 100) / pesoC_kg;
            grasaC_LB = grasaC_kg * 2.2;
            pGrasaCorporalLb = pGrasaCorporalkg * 2.2;
          
          
            System.out.println("Su grasa corporal en KG es " + grasaC_kg);
            System.out.println("Su grasa corporal en Lb es " + grasaC_LB);
            System.out.println("Su porcetaje de grasa corporal en Kg es " +pGrasaCorporalkg);
            System.out.println("Su porcentaje de grasa corporal en LB es " +pGrasaCorporalLb);
        
            break;

        case 'H':
        case 'h':

            
            System.out.println("Cual es su peso corporal");
            pesoC_kg = lector.nextDouble();
            A1 = (pesoC_kg * 1.082)+94.42;

            System.out.println("Cual es la medida de su cintura");
            mCintura= lector.nextDouble();
            A2= mCintura * 4.15;
          
            B = A1 - A2;
            grasaC_kg = pesoC_kg - B ;
            pGrasaCorporalkg = (grasaC_kg * 100) / pesoC_kg;
            grasaC_LB = grasaC_kg * 2.2;
            pGrasaCorporalLb = pGrasaCorporalkg * 2.2;    
            
            System.out.println("Su peso corporal en Kg es " + grasaC_kg);
            System.out.println("Su peso corporal en Lb es " + grasaC_LB);
            System.out.println("Su porcentaje de grasa corporal en Kg es" +pGrasaCorporalkg);
            System.out.println("Su porcentaje de grasa corporal en Lb es " +pGrasaCorporalLb);
        
          break;
        default:
        System.out.println("Solo se acepta las letras M y H");
        System.out.println("Las letras tienen que estar en mayuscula");
            break;
      }
     lector.close();
}
}


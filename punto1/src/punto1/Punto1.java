package punto1;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double salariobas=0, salarioConExt=0, ValorHora, ValorHT, ValorHE;
        int numHT=0, numHE=0, edad=0;
        String nombreCom;
          
          salariobas=1160000;
        System.out.println("Digite su nombre completo");
        nombreCom=in.next();
        System.out.println("Digite su edad");
        edad=in.nextInt();
        System.out.println("Salario basico: "+salariobas);
        System.out.println("Digite No de horas trabajadas");
        numHT=in.nextInt();
        System.out.println("Digite No de horas extras trabajadas");
        numHE=in.nextInt();
        ValorHora=(salariobas/30)/8;
        ValorHT=ValorHora*numHT;
        ValorHE=(ValorHora*0.25)+ValorHora;
        salarioConExt=ValorHT+(numHE*ValorHE);
        System.out.println("Su salario segun horas trabajadas mas horas extras es "+salarioConExt);
        /*while(){
              System.out.println("Digite su nombre completo");
            nombreCom= in.next();
   
              System.out.println("Digite su edad");
                edad=in.nextInt();
        
                System.out.println("Salario basico: "+salariobas);
        
        
                System.out.println("Digite No de horas trabajadas");
                numHT=in.nextInt();
        
                System.out.println("Digite No de horas extras trabajadas");
                numHE=in.nextInt();
                ValorHora=(salariobas/30)/8;
                ValorHT=ValorHora*numHT;
                ValorHE=(ValorHora*0.25)+ValorHora;
                salarioConExt=ValorHT+(numHE*ValorHE);
                System.out.println("Su salario segun horas trabajadas mas horas extras es "+salarioConExt);
        }*/
        
    }
    
}

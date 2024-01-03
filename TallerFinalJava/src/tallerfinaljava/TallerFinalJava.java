package tallerfinaljava;

import java.util.Scanner;


public class TallerFinalJava {
    
    public void Ejercicio1(){
        Scanner in=new Scanner(System.in);
        //srio es salario, prom es promedio
        //n es el número de empleados
        //valorHT :valor de hora
        //valorHE :valor de hora extra.
        double salariobas=1160000, salarioConExt=0, ValorHora, ValorHT, ValorHE, srioMaximo=0, srioMinimo=0, srioProm=0;
        int numHT=0, numHE=0, edad=0, n=0, i;
        //numHT :numero de horas trabajadas
        //numHE :numero de horas extras
        String nombreCom;
        
        System.out.println("Ingrese el número de empleados");
        n=in.nextInt();
        //i hace de contador 
        //i esta inicializada en cero para evitar un desbordamiento
        for(i=0; i<n; i++){
        
            System.out.println("Digite su nombre completo");
            nombreCom= in.next();
            
            System.out.println("Digite su edad");
            edad=in.nextInt();
            
            /*System.out.println("Ingrese su salario basico");
            salariobas=in.nextDouble();*/
            
            System.out.println("Digite No de horas trabajadas");
            numHT=in.nextInt();
            
            System.out.println("Digite No de horas extras trabajadas");
            numHE=in.nextInt();
            
            ValorHora=(salariobas/30)/8;
            ValorHT=ValorHora*numHT;
            ValorHE=(ValorHora*0.25)+ValorHora;
            salarioConExt=ValorHT+(numHE*ValorHE);
            System.out.println("Su salario según horas trabajadas mas horas extras es "+salarioConExt);
            
            if (salarioConExt > srioMaximo){
            srioMaximo = salarioConExt;
            }
            if (salarioConExt< srioMinimo){
                srioMinimo=salarioConExt;
            }
            
            srioProm+=salarioConExt;
        }
        srioProm /= n;//calcula el salario promedio
    
        System.out.println("Salario mínimo: " + srioMinimo);
        System.out.println("Salario máximo: " + srioMaximo);
        System.out.println("Salario promedio: "+ srioProm);
    }
    public void Ejercicio2(){
        Scanner in=new Scanner(System.in);
        int x=0, y=0, j=0;//j es un contador
        System.out.println("Vamos a sacar el rango de numeros que sean primos.\nEscriba un número.");
        x=in.nextInt();
        System.out.println("Escriba un número mayor al anterior.");
        y=in.nextInt();
        
        //j es un contador
        for (int p = x; p<=y; p++){
               int divisor=0;//cuenta los divisores de "p"
               j=1;
            while(j<=p/2){//while verifica los divisores de cada número en ese rango
                if (p%j==0){
                    divisor++;
                }
                j++;
                
            }//con 1 salen los número primos
            if (divisor==1){//se verifica si p tiene dos divisores que son 1 y el mismo
                System.out.println( p );
            }
        }  
    }
    public void Ejercicio3(){
        Scanner in=new Scanner(System.in);
        int i=1, x=0, suma=0, operacion;
        System.out.println("Ingre un número mayor a 4.\ningrese el valor de x:");
        x=in.nextInt();
        //suma acumula la suma total
        while(suma<x){
            operacion=(i *(i+1))*(i*(i+1));
                if (suma +operacion > x ){
                    break;
                }
           suma+=operacion;
            
            System.out.println("termino "+ i + ":"+operacion);
            i++;
        }
         System.out.println("la suma de los terminos :"+ suma);
         System.out.println("se necesitaron "+ (i-1)+ "términos para no superar "+ x);
    }
    public void Ejercicio4(){
        Scanner in=new Scanner(System.in);
        int n, i = 0; // n es el valor inicial, i es el valor que se ingresa
        double fac = 1; // fac significa factorial
        
        System.out.println("Digite un número para factorizar");
        i = in.nextInt();

        if (i == 0) {
            System.out.println("El número ingresado no se puede factorizar ya que es igual a cero");
        } else {
            System.out.print("Factorial de " + i + " es: " );
            //n es una variable de control
            //el ciclo se ejecuta mientra n>1
            for (n = i; n > 1; n--) {
                fac = fac * n;
                System.out.print(n + " * ");
            }
            System.out.println("1 = " + fac);
        }
    }       
    
    public static void main(String[] args) {
        int opcion=0;        
        TallerFinalJava p1=new TallerFinalJava();
        Scanner in =new Scanner(System.in); 
 
        System.out.println("\nOpción 1: sueldo de empleados \nOpción 2: Números primos en un rango de x a y\nOpción 3: Serie de números < x\nOpción 4: números factoriales.\nOpción 5 para finalizar. ");
        
        boolean fin= true;
        while(fin == true){
            System.out.println("Digite una opción");
            opcion=in.nextInt();
       
            switch(opcion){
                case 1: 
                    p1.Ejercicio1();
                break;
                case 2:
                    p1.Ejercicio2();
                break;
                case 3:
                    p1.Ejercicio3();
                break;
                case 4:
                    p1.Ejercicio4();
                break;
                case 5:
                    fin = false;
                    System.out.println("Programa finalizado.");
                break;
                default:
                    System.out.println("Opción no valida.");
                    System.out.println("Ingrese otra opción.");
            }
        }
    }
}


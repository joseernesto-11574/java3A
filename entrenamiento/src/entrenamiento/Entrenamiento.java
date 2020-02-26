
package entrenamiento;

import java.util.Scanner;


public class Entrenamiento {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1,numero2,resultado;
        System.out.println("ingrese el primer numero");
        numero1 = reader.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2=reader.nextInt();
        resultado=numero1+numero2;
        
        System.out.println("la suma es=\n" +resultado);
                
        
        
    }
    
}

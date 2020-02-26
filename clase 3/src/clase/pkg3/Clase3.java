
package clase.pkg3;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
       int numero1 = 0,suma,resta,multiplicacion;
       float division;
int numero2 = 0;
	
System.out.println("Introduce el primer número:");			
numero1 = reader.nextInt();
			
System.out.println("Introduce el segundo número:");
numero2 = reader.nextInt();
suma=numero1+numero2;
resta=numero1-numero2;
multiplicacion=numero1*numero2;
division=numero1/numero2;

System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + suma);
System.out.println("la resta es"+numero1+"-"+numero2+"="+resta);
System.out.println("la multiplicaciones"+numero1+"*"+numero2+"="+multiplicacion);
System.out.println("la division"+numero1+"/"+numero2+"/"+division);

    }
    
}

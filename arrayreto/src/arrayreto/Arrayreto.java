/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreto;

import java.util.Scanner;

/**
 *
 * @author Jaime Pantoja
 */
public class Arrayreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
 
     System.out.println("ingrese N numeros enteros del vector");
     int n=input.nextInt();
     int[] Arreglo=new int [n];
     
     for (int i=0;i<n;i++)
     {
         Arreglo[i]=input.nextInt();
         int suma=Arreglo[Arreglo.length-1]+Arreglo[Arreglo.length-2];
      if(Arreglo[i]==suma){
System.out.println("no es posible agregar ese numero, "
        + "ya que la suma del ultimo y penultimo numero "
        + "existentes en el vector hasta el momento es igual al "
        + "valor que desea ingresar");

System.out.println("deve ingresar otro numero:");
      }            
    }
     
    
     
         
     }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Menu {
public static void main (String[] args) {
Scaner leer = new Scanner (System.in);
int respuesta;
respuesta = leer.nextInt();
system.out.print("Presione 1 para suma");
system.out.print("Presione 2 para resta");
system.out.print("Presione 3 para multiplicación");
system.out.print("Presione 4 para división");
switch (respuesta) {
case 1:
system.out.print("Ha seleccionado suma");
int suma;
int a;
a = leer.nextInt();
int b;
b = leer.nextInt();
suma = a + b;
system.out.print("La suma es: " + suma);
break;

case 2:
system.out.print("Ha seleccionado resta");
int resta;
int c;
c = leer.nextInt();
int d;
d= leer.nextInt();
suma = c - d;
system.out.print("La resta es: " + resta);
break;

case 3:
system.out.print("Ha seleccionado multiplicacion");
int multiplicacion;
int e;
e = leer.nextInt();
int f;
f = leer.nextInt();
suma = e * f;
system.out.print("La multiplicacion es: " + multiplicacion);
break;

case 4:
system.out.print("Ha seleccionado division");
int division;
int g;
g = leer.nextInt();
int h;
h = leer.nextInt();
suma = g / h;
system.out.print("La division es: " + division);
break;

}//fin metodo switch
}//Fin del metodo void
}//Fin de la clase

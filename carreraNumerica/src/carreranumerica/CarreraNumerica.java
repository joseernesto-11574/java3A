/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreranumerica;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CarreraNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nj=0,nivel=0;
        Scanner lnj = new Scanner(System.in);
        do{
            System.out.print("Digite el número de jugadores (min. 2 - max. 4): ");
            nj = lnj.nextInt();
        }while(nj<2 || nj >4);
        do{
            System.out.print("Digite el nivel (1. básico - 2. medio - 3. avanzado): ");
            nivel = lnj.nextInt();
        }while(nivel<1 || nivel >3);
        if(nivel == 1){
            nivelBasico(nj);
        }
        else if(nivel == 2){
            nivelIntermedio(nj);
        }
        else if(nivel == 3){
            nivelAvanzado(nj);
        }
    }
        public static void nivelBasico(int nj) {
            int j1=0,j2=0,j3=0,j4=0;
            int p1=0,p2=0,p3=0,p4=0;
            do{
                for(int i=1;i<=nj;i++){
                try {
                        System.out.println("Jugador "+i+" lanzando dados...");
                        Thread.sleep(3*1000);
                    }catch (Exception e){      
                    }
                    int num = (int) (Math.random() * 12) + 1;
                    System.out.println("El jugador "+i+" avanza "+num+" casillas"); 
                    if(i==1){
                        j1=j1+num;
                        if(num%2==0){p1=p1+1;}
                        System.out.println("Jugador 1 posición: "+j1+" ("+p1+" pares)");
                        if(j1>=20||p1==3){System.out.println("Jugador 1 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==2){
                        j2=j2+num;
                        if(num%2==0){p2=p2+1;}
                        System.out.println("Jugador 2 posición: "+j2+" ("+p2+" pares)");
                        if(j2>=20||p2==3){System.out.println("Jugador 2 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==3){
                        j3=j3+num;
                        if(num%2==0){p3=p3+1;}
                        System.out.println("Jugador 3 posición: "+j3+" ("+p3+" pares)");
                        if(j3>=20||p3==3){System.out.println("Jugador 3 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==4){
                        j4=j4+num;
                        if(num%2==0){p4=p4+1;}
                        System.out.println("Jugador 4 posición: "+j4+" ("+p4+" pares)");
                        if(j4>=20||p4==3){System.out.println("Jugador 4 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                }
            }while(j1<20||j2<20||j3<20||j4<20);
    }
        public static void nivelIntermedio(int nj) {
            int j1=0,j2=0,j3=0,j4=0;
            int p1=0,p2=0,p3=0,p4=0;
            do{
                for(int i=1;i<=nj;i++){
                try {
                        System.out.println("Jugador "+i+" lanzando dados...");
                        Thread.sleep(3*1000);
                    }catch (Exception e){      
                    }
                    int num = (int) (Math.random() * 12) + 1;
                    System.out.println("El jugador "+i+" avanza "+num+" casillas"); 
                    if(i==1){
                        j1=j1+num;
                        if(num%2==0){p1=p1+1;}
                        System.out.println("Jugador 1 posición: "+j1+" ("+p1+" pares)");
                        if(j1>=30||p1==3){System.out.println("Jugador 1 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==2){
                        j2=j2+num;
                        if(num%2==0){p2=p2+1;}
                        System.out.println("Jugador 2 posición: "+j2+" ("+p2+" pares)");
                        if(j2>=30||p2==3){System.out.println("Jugador 2 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==3){
                        j3=j3+num;
                        if(num%2==0){p3=p3+1;}
                        System.out.println("Jugador 3 posición: "+j3+" ("+p3+" pares)");
                        if(j3>=30||p3==3){System.out.println("Jugador 3 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==4){
                        j4=j4+num;
                        if(num%2==0){p4=p4+1;}
                        System.out.println("Jugador 4 posición: "+j4+" ("+p4+" pares)");
                        if(j4>=30||p4==3){System.out.println("Jugador 4 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                }
            }while(j1<30||j2<30||j3<30||j4<30);
    }
        public static void nivelAvanzado(int nj) {
            int j1=0,j2=0,j3=0,j4=0;
            int p1=0,p2=0,p3=0,p4=0;
            do{
                for(int i=1;i<=nj;i++){
                try {
                        System.out.println("Jugador "+i+" lanzando dados...");
                        Thread.sleep(3*1000);
                    }catch (Exception e){      
                    }
                    int num = (int) (Math.random() * 12) + 1;
                    System.out.println("El jugador "+i+" avanza "+num+" casillas"); 
                    if(i==1){
                        j1=j1+num;
                        if(num%2==0){p1=p1+1;}
                        System.out.println("Jugador 1 posición: "+j1+" ("+p1+" pares)");
                        if(j1>=50||p1==3){System.out.println("Jugador 1 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==2){
                        j2=j2+num;
                        if(num%2==0){p2=p2+1;}
                        System.out.println("Jugador 2 posición: "+j2+" ("+p2+" pares)");
                        if(j2>=50||p2==3){System.out.println("Jugador 2 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==3){
                        j3=j3+num;
                        if(num%2==0){p3=p3+1;}
                        System.out.println("Jugador 3 posición: "+j3+" ("+p3+" pares)");
                        if(j3>=50||p3==3){System.out.println("Jugador 3 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                    else if(i==4){
                        j4=j4+num;
                        if(num%2==0){p4=p4+1;}
                        System.out.println("Jugador 4 posición: "+j4+" ("+p4+" pares)");
                        if(j4>=50||p4==3){System.out.println("Jugador 4 GANADOR");System.exit(0);}
                        System.out.println();
                    }
                }
            }while(j1<50||j2<50||j3<50||j4<50);
    }
}

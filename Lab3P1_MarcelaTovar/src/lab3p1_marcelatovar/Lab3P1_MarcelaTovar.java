
package lab3p1_marcelatovar;

import java.util.Scanner;
public class Lab3P1_MarcelaTovar {

    
    public static void main(String[] args) {
        do{
            Scanner ObiWan = new Scanner(System.in);
            System.out.println("--MENU--");
            System.out.println(" 1. Ejercicio 1");
            System.out.println(" 2. Ejercicio 2");
            System.out.println(" 3. Ejercicio 3");
            System.out.println(" 4.Ejercicio 4");
            System.out.print("Escoger opcion");
            int opcion = ObiWan.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese la cadena: ");
                    String cadena = ObiWan.next();
                    int largo_cadena= cadena.length();
                    int acumulador = 0;
                    for (int i =0; i < largo_cadena; i++){
                        acumulador = acumulador + cadena.charAt(i);
                    }
                    
                    
                    
                case 2:
                    System.out.print("Ingrese el valor de k: ");
                    double k=ObiWan.nextInt();
                    double respuesta_final = 0;
                    for (int n=1; n<=k; n++){
                        double suma1 = 2*n+1;
                        
                        // ---------------
                        double suma2 = (n*n)+3;
                        double acumula = 1;
                        for (int conta =1; conta<=suma2;conta++){
                            acumula=acumula*conta;
                        }
                       
                        /*double conta = 1;
                        while (conta<= suma2){
                            conta++;
                            acumula=acumula*conta;
                            
                        }*/
                        
                        
                        //---------------
                        double exponente = n;
                        double expo = 0;
                        for (int c = 1; c < k;c++){
                        exponente = exponente *n;
                        expo = exponente;
                        
                        
                         }
                        
                        //---------------
                        
                    
                    respuesta_final = respuesta_final + (suma1*exponente)/acumula;
                    
                    }
                    System.out.println(respuesta_final);
                    
                   
                case 3: 
                    System.out.print("Ingrese la altura: ");
                    int altura = ObiWan.nextInt();
                    for (int i =altura; i>=0; i--){
                        for (int espacio=altura; espacio>=i;espacio -=1){
                            System.out.print(" ");
                        }
                        for (int asterisco = 1; asterisco <= i; asterisco +=1){
                               System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                case 4: 
                    break;
            }
            
        }while(true);
    }
    
}

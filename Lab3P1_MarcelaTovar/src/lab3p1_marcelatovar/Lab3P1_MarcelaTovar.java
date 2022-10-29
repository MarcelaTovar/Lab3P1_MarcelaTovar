
package lab3p1_marcelatovar;

import java.util.Scanner;
public class Lab3P1_MarcelaTovar {

    
    public static void main(String[] args) {
        int opcion =0;
        do{
           
            Scanner ObiWan = new Scanner(System.in);
            System.out.println("--MENU--");
            System.out.println(" 1. Ejercicio 1");
            System.out.println(" 2. Ejercicio 2");
            System.out.println(" 3. Ejercicio 3");
            System.out.println(" 4. Salida");
            System.out.print("Escoger opcion: ");
            opcion = ObiWan.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese la cadena: ");
                    ObiWan.nextLine();
                    String cadena = ObiWan.nextLine();
                    int largo_cadena= cadena.length();
                    int acumulador = 0;
                    

                    for (int i =0; i <= largo_cadena; i++){
                        acumulador += cadena.charAt(i);
                        String cadena2 =cadena.substring(acumulador);
                        if (cadena2.contains(".")){
                            int cadena3 = cadena.length()-1;
                            System.out.print(cadena2);
                        }
                        
                    }
                    break;
                    
                    
                    
                case 2:
                    System.out.println("¡Hola! Este programa calcula la sumatoria.");
                    System.out.println("¿Como te gustaría que te llamará?");
                    ObiWan.nextLine();
                    String nombre=ObiWan.nextLine();
                    System.out.print("Ingrese el valor de k: ");
                    double k=ObiWan.nextInt();
                    double respuesta_final = 0;
                    for (int n=1; n<=k; n++){
                        double suma1 = 2*n+1; //Siguiendo el PEMDAS primero hice el parentesis de la parte de arriba.
                        
                        // ---------------
                        double exponente = n;
                        double expo = 0;
                        for (int c = 1; c < k;c+=1){
                        exponente *= n;
                        expo = exponente;
                        }
                        /*Para el exponente empezamos un contador nuevo que multiplique el numero las
                        veces de k.*/
                        
                        double suma3=suma1*expo;
                        //Siguiendo el PEMDAS, multiplicamos la respuesta del exponent con la suma1
                        
                        
                        double suma2 = (n*n)+3;// Luego, para hacer el limite del factorial, hacemos la ecuación adentro
                        double acumula = 1;//También siempre siguiendo el PEMDAS
                        double acumula2 = 0;
                        for (int conta =1; conta<=suma2;conta++){
                            acumula*=conta;
                            acumula2=acumula;
                        }
                        /*Mientras el contador sea menor o igual a suma2, se aumenta 1 y se va guardando
                        en acumula que guarda su valor en acumula2.*/
 
                        //---------------
                        
                        double respuesta = suma3/acumula2;
                        
                        /*Se dividen esos dos resultados para simplificar*/
                         
                        
                        //---------------
                        
                    
                    respuesta_final += respuesta;
                    //Contador de la respuesta final.
                    
                    }
                    System.out.println("Esta es la respuesta final " +nombre +" "+ respuesta_final);
                    break;
                    
                   
                case 3: 
                    System.out.print("Ingrese la altura: ");
                    int altura = ObiWan.nextInt();
                    for (int i =altura; i>=0; i--){
                        for (int espacio=altura; espacio>=i;espacio -=2){
                            System.out.print(" ");
                        }
                        for (int asterisco = 1; asterisco <= altura; asterisco +=1){
                               System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                    
                case 4:
                    if (opcion == 4){
                    break;
                    }
                
            }
            
        }while(opcion == 1||opcion==2||opcion==3);
        
        
        
    }
    
}

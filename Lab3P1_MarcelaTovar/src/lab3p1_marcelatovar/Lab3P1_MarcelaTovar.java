
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
                    System.out.println("¡Hola Stephanie! No termine este ejercicio :(");
                    System.out.println("¿Como te gustaría que te llamara?: ");
                    ObiWan.nextLine();
                    String nombre1 = ObiWan.nextLine();
                    System.out.println("Ingrese la cadena: ");
                   
                    String cadena = ObiWan.nextLine();
                    int largo_cadena= cadena.length();
                    int acumulador = 0;
                    

                    for (int i =largo_cadena-1; i >= 0; i--){
                        
                        String cadena2 =cadena.substring(acumulador);
                        if (cadena2.contains(".")){
                            int cadena3 = cadena.length()-1;
                            System.out.print(cadena2);
                        }
                    
                    }
                    System.out.println("Será otro día "+nombre1 +" .");
                    break;
                    
                    
                    
                case 2:
                    System.out.println("¡Hola! Este programa calcula la sumatoria.");
                    System.out.println("¿Como te gustaría que te llamará?");
                    ObiWan.nextLine();
                    String nombre=ObiWan.nextLine();
                    double k = 1;
                    System.out.print("Ingrese el valor de k: ");
                    k=ObiWan.nextInt();
                    if (k != 0){
                    
                    double respuesta_final = 0;
                    for (int n=1; n<=k; n+=1){
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
                        for (int conta =1; conta<=suma2;conta+=1){
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
                    }else{
                        System.out.println("Favor ingrese un valor válido.");
                        break;
                    }
                   
                case 3: 
                    System.out.println("¡Hola Stephanie! No termine este ejercicio tampoco :(");
                    System.out.print("Ingrese la altura: ");
                    int altura = ObiWan.nextInt();
                    System.out.print("¿Como te gustaría que te llamará?: ");
                    ObiWan.nextLine();
                    String nombre3 = ObiWan.nextLine();
                    for (int contador = altura; contador >= 0; contador --){
                    for (int espacios=altura; espacios >=  contador ; espacios -= 1 ){
                       System.out.print(" ");
                    }
                    
                    for (int asteriscos = 1; asteriscos <= contador; asteriscos+=1){
                        
                        System.out.print("* ");
                 
                    }
                    System.out.println(" ");
                    }
                   for (int contador = 0; contador <= altura; contador ++){
                   for (int espacios=altura; espacios >=  contador ; espacios -= 1 ){
                       System.out.print(" ");
                    }
                    
                    for (int asteriscos = 1; asteriscos <= contador; asteriscos+=1){
                        
                        System.out.print("* ");
                 
                    }
                    System.out.println(" ");
                    }
                    System.out.println("¡Aquí está tu casí reloj de arena "+nombre3+ "!");
                    break;
                    
                case 4:
                    if (opcion == 4){
                    break;
                    }
                
            }
            
        }while(opcion == 1||opcion==2||opcion==3);
        
        
        
    }
    
}

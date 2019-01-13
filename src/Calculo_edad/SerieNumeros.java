/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_edad;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


/**
 *
 * @author jhon1
 */

public class SerieNumeros {
    
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException   {

            System.out.println("Acontinuacion e muetra la serie de numeros pares e impares");
            
            PrintStream GuardarTxt = new PrintStream("Datos.txt");
            int li;
            System.out.println("Ingrese la cantidad de nuemros a evaluar: ");
            Scanner sc = new Scanner(System.in);
            li= sc.nextInt();
            
            // Variables par          
            int Par;
            //Variable que contendra la suma de los numeros pares generados
            int Suma_par=0;
            

            // ciclo para numero par     
            for(int i=1;i<=li;i++){
                if(i%2==0){
                   Par=i;
                   
           // Para sumas los numeros pares generados        
                   Suma_par =Suma_par+i;
                   System.out.println("Numero par:"+Par);
                   GuardarTxt.print("Numero par:"+Par);
                }
                
            }
           // Mostrar y guardar la suma delos numeros pares
            System.out.println("La suma de los pares son:"+Suma_par);
            GuardarTxt.print("La suma es :"+Suma_par);
            //Numero impares
            System.out.println("Acontinuacion se muestra la serie de numeros imparesn");

            //Variable inpar
            int Inpar=1;
            //Nueva variable para la multiplicacion
            int Multiplicacion_impar=1;
            
            //Cilo while para numeros inpares
            while(Inpar<=li){
            
            //Multplicacion de los numeros
                Multiplicacion_impar = Multiplicacion_impar*Inpar;
                
                System.out.println("Numero impar:"+Inpar);
                GuardarTxt.print("Numero inpar:"+Inpar);
                Inpar=Inpar+2;

            }
            System.out.println("Multiplicacion numeros impares:"+Multiplicacion_impar);
            GuardarTxt.print("Resultado de la Multplicacion impares:"+Multiplicacion_impar);
        }             
    }        
   

 





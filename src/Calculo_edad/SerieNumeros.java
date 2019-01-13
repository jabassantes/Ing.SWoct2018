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
            

            // ciclo para numero par     
            for(int i=1;i<=li;i++){
                if(i%2==0){
                   Par=i;
                   System.out.println("Numero par:"+Par);
                   GuardarTxt.print("Numero par:"+Par);
                }
            }

            //Numero impares
            System.out.println("Acontinuacion se muestra la serie de numeros imparesn");

            //Variable inpar
            int Inpar=1;
            
            //Cilo while para numeros inpares
            while(Inpar<li){

                System.out.println("Numero impar:"+Inpar);
                GuardarTxt.print("Numero inpar:"+Inpar);
                Inpar=Inpar+2;

            }
        }             
    }        
   

 





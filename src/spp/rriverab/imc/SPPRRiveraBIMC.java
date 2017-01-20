/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rriverab.imc;

//Librería
import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class SPPRRiveraBIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in);
       
      //Entrada
       System.out.println("Calculadora IMC");
       System.out.println(" ");
       
       //Declaración de variables
       double w,l, imc;
       String eIMC;
       
        //Capturar variables
        System.out.println("Introduzca su altura");
        l=entrada.nextDouble();
        
        System.out.println("Introduzca su peso");
        w=entrada.nextDouble();
        
        System.out.println("Su IMC marca que tiene: ");
        
        //Resolver problema
        imc= w/Math.pow(l,2);
        
        if(imc<18.5){   
         eIMC = "Bajo peso";   
        }
        else if (imc<=25 && imc>=18.5){
         eIMC = "Peso normal";
        }
        else if(imc<30 && imc>25){
         eIMC = "Sobrepeso";
        }
        else {eIMC = "Obesidad";}
        
        //Mostrar resultado
        System.out.println("Altura = " +l);
        System.out.println("Peso = " +w);
        System.out.println("IMC = " +imc);
        System.out.println(eIMC);
        }
  
    }
    


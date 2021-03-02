/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Figura1 {
     Scanner sc=new Scanner (System.in);
    private int Fila;
    
    public Figura1(){
        System.out.println("Figura de asteriscos 1");
    }
    public void Entrada(){
        System.out.print("Numero Filas:");
         Fila=sc.nextInt();
        for(int i=0; i<Fila; i++){
            for(int j=Fila-1; j>0; j--){
                System.out.print("  ");
            }
               for(int k=0; k<i+1; k++){
                   System.out.print(" *");
            }
                System.out.println("");
        }
    }

}

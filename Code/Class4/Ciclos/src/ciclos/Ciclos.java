/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Ciclo For
         * 
         */
        
        int cantidad;
        int suma = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite el # de impreseiones que desea ver");
        
        cantidad = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(i);
        }
        
        System.out.println("Inverso");
        
        for (int i = cantidad; i >= 0; i--) {
            System.out.println(i);
        }
        
        /**
         * Ciclo While
         * 
         */
        
        while(suma<=cantidad){
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;
        }
        
        System.out.println("\n");
        suma = cantidad;
        while(suma>=0){
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;
        }
        
        System.out.println("\n");
        
        suma=0;
        do {            
            System.out.print(suma);
            System.out.print(" - ");
            suma= suma+1;
        } while (suma<= cantidad);
        
        System.out.println("\n");
        suma=cantidad;
        
        do {            
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma -1;
        } while (suma>=0);
    }
    
}

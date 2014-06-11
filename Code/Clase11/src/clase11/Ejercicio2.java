/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;

import java.util.Scanner;

/**
 * 
 * @author Mario A
 */
class Ejercicio2 {
    
    private int[][] matriz;
    private Scanner teclado;
    
    
    public void cargarMatriz(){
        
        teclado = new Scanner(System.in);
        matriz = new int [4][4];
        
        for (int f = 0; f < 4; f++) 
        {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c] = teclado.nextInt();
            }            
        }        
    }
    
    public void Imprimir(){
        
        for (int f = 0; f < 4; f++) 
        {
            for (int c = 0; c < 4; c++) {
                if(f == c){
                    System.out.println('x' + " ");
                }
                else{
                    System.out.println();
                }
            }            
        }        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.matriz;

import java.util.Scanner;

/**
 * 
 * @author Mario A
 */
class Ejercicio1 {
    
    
    private int[][] matriz;
    private Scanner teclado = new Scanner(System.in);
    
    public void crearMatriz()
    {        
        matriz = new int[2][5];
        
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Digite el valor del campo");
                matriz[f][c] = teclado.nextInt();
            }            
        }        
        Imprimir(2, 5);
    }
    
    public void crearMatrizNxM(){
        
        System.out.println("Digite la cantidad de filas de la matriz");
        int filas = teclado.nextInt();
        System.out.println("Digite la cantidad de columnas de la matriz");
        int columnas = teclado.nextInt();
        
        matriz = new int[filas][columnas];
        
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Digite el valor del campo");
                matriz[f][c] = teclado.nextInt();
            }            
        }  
        
        Imprimir(filas, columnas);
        
        int[] filasAux;
        filasAux = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = filasAux;
        
        System.out.println("Cambio Filas 1 y 2");
        
        Imprimir(filas, columnas);
    }
    
    public void Imprimir(int filas, int columnas)
    {        
        for (int f = 0; f < filas; f++) 
        {
            for (int c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();            
        }
    }
    
    
    public void generarMatrizMxNEsquinas(){
        
        System.out.println("Digite la cantidad de filas de la matriz");
        int filas = teclado.nextInt();
        System.out.println("Digite la cantidad de columnas de la matriz");
        int columnas = teclado.nextInt();
        
        matriz = new int[filas][columnas];
        
        for (int c = 0; c < columnas; c++) {
            for (int f = 0; f < filas; f++) {
                System.out.println("Digite el valor del campo");
                matriz[f][c] = teclado.nextInt();
            }            
        }  
        
        Imprimir(filas, columnas);
        
        System.out.println("Los valores de las cuatro esquinas son: ");
        System.out.println(matriz[0][0] + "   " + matriz[0][columnas-1]);
        System.out.println(matriz[filas-1][0] + "   " + matriz[filas-1][columnas-1]);
    }
    
    
    public void generarMatrizEImprimirMayor(){
        
        System.out.println("Digite la cantidad de filas de la matriz");
        int filas = teclado.nextInt();
        System.out.println("Digite la cantidad de columnas de la matriz");
        int columnas = teclado.nextInt();
        
        matriz = new int[filas][columnas];
        
        for (int c = 0; c < columnas; c++) {
            for (int f = 0; f < filas; f++) {
                System.out.println("Digite el valor del campo");
                matriz[f][c] = teclado.nextInt();
            }            
        }  
        
        Imprimir(filas, columnas);
        
        int mayor = 0;
        String leyenda = "El elemento mayor se encuentra en la fila " + mayor;
        
        for (int c = 0; c < columnas; c++) {
            for (int f = 0; f < filas; f++) {
                if (matriz[f][c] > mayor)
                {
                    mayor = matriz[f][c];
                    leyenda = "El elemento mayor es " + mayor + " y se encuentra en la fila " + (f+1);
                    
                }
            }            
        }
        
        System.out.println(leyenda);
        
        
    }

}

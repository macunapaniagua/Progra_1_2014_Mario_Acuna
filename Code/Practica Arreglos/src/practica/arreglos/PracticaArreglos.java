/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        MetodosArreglos oMetodos = new MetodosArreglos();

        // ************* Ejercicio 1 *****************
        int[] arreglo = new int[8];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero entero para agregarlo al arreglo");
            arreglo[i] = teclado.nextInt();            
        }
        System.out.println("La suma de todos los numeros del arreglo es: " + oMetodos.sumarElementos(arreglo));
        System.out.println("La suma de los mayores a 36 es: " + oMetodos.sumarMayores36(arreglo));
        System.out.println("La suma de los mayores a 50 es: " + oMetodos.sumarMayores50(arreglo));
        // ************** Ejercicio 2 ****************
        int[] primerArreglo = new int[4];
        int[] segundoArreglo = new int[4];
        
        for (int i = 0; i < primerArreglo.length; i++) {
            System.out.println("Digite un numero entero para ingresarlo al primer arreglo");
            primerArreglo[i] = teclado.nextInt();            
        }
        
        for (int i = 0; i < segundoArreglo.length; i++) {
            System.out.println("Digite un numero entero para ingresarlo al segundo arreglo");
            segundoArreglo[i] = teclado.nextInt();            
        }
        
        int[] arregloResultado = oMetodos.sumarArreglos(primerArreglo, segundoArreglo);        
        System.out.print("\nEl resultado de la suma de elemento por elemento es: ");
        for (int i = 0; i < arregloResultado.length; i++) {
            System.out.print(arregloResultado[i] + "-");            
        }
        System.out.println("");
        //********** Ejecicio 3 *****************
        int[] cursoA = new int[5];
        int[] cursoB = new int[5];
        
        for (int i = 0; i < cursoA.length; i++) {
            System.out.println("Digite la nota del alumno " + (i+1) + " del curso A");
            cursoA[i] = teclado.nextInt();            
        }
        
        for (int i = 0; i < cursoB.length; i++) {
            System.out.println("Digite la nota del alumno " + (i+1) + " del curso B");
            cursoB[i] = teclado.nextInt();            
        }        
        System.out.println(oMetodos.mejorCurso(cursoA, cursoB));
        // ***************** Ejercicio 4 ********************
        int[] arregloOrdenado = new int[10];

        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println("Digite el numero entero " + (i + 1) + " del arreglo");
            arregloOrdenado[i] = teclado.nextInt();
        }

        if (oMetodos.estaOrdenado(arregloOrdenado)) {
            System.out.println("El arreglo ingresado esta ordenado");
        } else {
            System.out.println("El arreglo ingresado no se encuentra ordenado");
        }
    }

}

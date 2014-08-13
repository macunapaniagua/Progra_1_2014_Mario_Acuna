/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EstructuraDeDatos;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class PracticaEstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
        //*********** Ejercicio 1 ****************
        ListaSimple oLista = new ListaSimple();
        while(true){
            System.out.println("Digite un numero entero para ingresarlo a la lista o 0 para detenerse");
            int numero = Integer.parseInt(teclado.next());
            if(numero == 0){
                break;
            }else
                oLista.insertarOrdenadoPorEdad(numero);
        }
        System.out.println("\nLos elementos de la lista son: " + oLista.imprimir());
        
        // ************** Ejercicio 2 *****************************
        System.out.println("La cantidad de numeros que componen la lista es de: " + oLista.lenght());
    }
    
}

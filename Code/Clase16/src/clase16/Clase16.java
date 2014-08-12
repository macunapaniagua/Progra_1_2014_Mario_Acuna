/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author Mario A
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo = {"Mario", "Efren", "Suana", "Campbell", "Agustin", "Elias"};
        BusquedaLineal busquedaLineal = new BusquedaLineal();
        System.out.print("La busqueda lineal es:" + busquedaLineal.BuscarNombre(arreglo, "Efren"));
        System.out.println();
        String[] arreglo2 = {"Campbell", "Agustin", "Suana", "Elias", "Efren", "Mario"};
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        System.out.println("La busqueda binaria es:" + busquedaBinaria.BuscarNombre(arreglo2, "Campbell"));
    }
}

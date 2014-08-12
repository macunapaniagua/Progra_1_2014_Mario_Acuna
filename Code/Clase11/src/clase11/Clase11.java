/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;

/**
 *
 * @author Mario A
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejercicio1 oEjercicio1 = new Ejercicio1();
        oEjercicio1.cargarMatriz();
        oEjercicio1.Imprimir();
        
        Ejercicio2 oEjercicio2 = new Ejercicio2();
        oEjercicio2.cargarMatriz();
        oEjercicio2.Imprimir();
        
        Ejercicio3 oEjercicio3 = new Ejercicio3();
        oEjercicio3.cargarMatriz();
        oEjercicio3.primeraFila();
        oEjercicio3.primerColumna();
        oEjercicio3.ultimaFila();
        oEjercicio3.ultimaColumna();
        
        
    }
    
}

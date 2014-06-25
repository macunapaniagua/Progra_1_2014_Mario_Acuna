/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

/**
 *
 * @author Mario A
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] arreglo = {56,4,85,85,42};
        int[] arregloOrdenado;
        OrdenamientoSeleccion os = new OrdenamientoSeleccion();
        arregloOrdenado = os.OrdenS(arreglo, "A");
        System.out.println("Selection Sort");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.print(arregloOrdenado[i] + "  ");
            
        }
        System.out.println("");
    }
    
}

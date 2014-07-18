/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase17;

/**
 *
 * @author Mario A
 */
public class Clase17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista oLista = new Lista();
        oLista.Insertar("Efren", "201111-4");
        oLista.Insertar("Joss", "3675949-5");
        oLista.Insertar("Navas", "7444455-6");
        oLista.Imprimir();
        
        oLista.modificarElemento("Joss", "Jose");
        oLista.Imprimir();
        
        oLista.eliminarElemento("Joss");
        oLista.Imprimir();
        
//        oLista.eliminarAlFinal();
//        oLista.Imprimir();
//        
//        oLista.eliminarAlInicio();
//        oLista.Imprimir();
//          
    }
    
}

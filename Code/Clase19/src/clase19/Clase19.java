/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase19;

/**
 *
 * @author Mario A
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila oPila = new Pila();
        oPila.Push("Efren");
        oPila.Push("Joss");
        oPila.Push("Andrey");
        oPila.Push("Jose");
        oPila.Imprimir();
        System.out.println("La cantidad de elementos es: " + oPila.Cantidad());
        if (!oPila.vacia()) {
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("La pila esta vacia");
        }
        oPila.Pop();
        oPila.Pop();
        oPila.Imprimir();
        
    }
    
}

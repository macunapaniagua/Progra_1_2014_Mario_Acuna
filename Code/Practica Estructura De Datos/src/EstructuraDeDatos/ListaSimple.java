/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDeDatos;

/**
 *
 * @author Mario A
 */
public class ListaSimple {

    Nodo raiz = null;

    public ListaSimple() {
    }

    public void insertarOrdenadoPorEdad(int pNumero) {
        
        Nodo nuevoNodo = new Nodo(pNumero);
        // La lista esta vacia. La raiz apunta al nuevo elemento.
        if (raiz == null) {
            raiz = nuevoNodo;
        } 
        // El numero a insertar es de menor que el primer elemento de la lista
        else if (nuevoNodo.getNumero() < raiz.getNumero()) {
            nuevoNodo.setSiguiente(raiz);
            raiz = nuevoNodo;
        } // Se busca la posicion en la lista donde se debe insertar el numero
        else {
            Nodo nodoActual = raiz;

            while (nodoActual.getSiguiente() != null && nuevoNodo.getNumero() > nodoActual.getSiguiente().getNumero()) {
                nodoActual = nodoActual.getSiguiente();
            }
            nuevoNodo.setSiguiente(nodoActual.getSiguiente());
            nodoActual.setSiguiente(nuevoNodo);
        }
    }
    
    public String imprimir(){        
        Nodo nodoActual = raiz;
        String respuesta = "";
        while(nodoActual != null){
            respuesta += "-" + nodoActual.getNumero(); 
            nodoActual = nodoActual.getSiguiente();
        }      
        return respuesta;
    }
    
    public int lenght(){        
        Nodo nodoActual = raiz;
        int total = 0;
        while(nodoActual != null){
            total++; 
            nodoActual = nodoActual.getSiguiente();
        }      
        return total;
    }
}

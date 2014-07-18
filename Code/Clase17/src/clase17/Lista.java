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
public class Lista {
    
    private NodoDeLista raiz;
    
    public Lista(){
        raiz = null;
    }
    
    public void Insertar(String dato, String cuentaBancaria){
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuentaBancaria);
        if(raiz == null){
            nuevo.setSiguiente(null);
            raiz = nuevo;
        }
        else{
            // Insercion al final de la lista
            NodoDeLista auxiliar = raiz;
            while(auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            // raiz = auxiliar
        }
    }
    
    public void Imprimir(){
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while(recorrido != null){
            System.out.println(recorrido.getDato() + " , La cuenta bancaria es " + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println("");
    }
    
    public boolean esVacia(){
        if(raiz == null)
            return true;
        else
            return false;                    
    }
    
    public void eliminarAlInicio(){
        raiz = raiz.getSiguiente();
    }
    
    public void eliminarAlFinal(){
        if(raiz != null)
        {            
            if(raiz.getSiguiente() == null){
                raiz = null;
            }
            else
            {
                NodoDeLista recorrido = raiz;
                while(recorrido.getSiguiente().getSiguiente() != null){
                    recorrido = recorrido.getSiguiente();
                }
                recorrido.setSiguiente(null);
            }
        }
    }
    
    public void eliminarElemento(String pDato){
        if(raiz != null)
        {            
            if(raiz.getSiguiente() == null && raiz.getDato().equals(pDato)){
                raiz = null;
            }
            else
            {
                NodoDeLista recorrido = raiz;
                while(recorrido.getSiguiente().getSiguiente() != null && !recorrido.getSiguiente().getDato().equals(pDato)){
                    recorrido = recorrido.getSiguiente();
                }
                if(recorrido.getSiguiente().getDato().equals(pDato)){
                    recorrido.setSiguiente(recorrido.getSiguiente().getSiguiente());
                }
            }
        }
    }
    
    public void modificarElemento(String pDatoAModificar, String pNuevoDato){
        if(raiz != null){
            NodoDeLista recorrido = raiz;
            while(recorrido.getSiguiente() != null && !recorrido.getDato().equals(pDatoAModificar)){
                recorrido = recorrido.getSiguiente();
            }
            if(recorrido.getDato().equals(pDatoAModificar)){
                recorrido.setDato(pNuevoDato);
            }
        }
    }
}

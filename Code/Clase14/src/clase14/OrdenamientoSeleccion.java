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
public class OrdenamientoSeleccion {
    
    public int[] OrdenS(int[] arreglo, String ordenamiento){
     
        int indice = 0;
        int indice2 = 0;
        int menor = 0;
        int posicion = 0;
        int temporal1 = 0;
        
        for (indice = 0;  indice< arreglo.length - 1; indice++) {
            menor = arreglo[indice];
            posicion = indice;
            for (indice2 = indice+1; indice2 < arreglo.length; indice2++) {
                if(menor > arreglo[indice2]){
                    menor = arreglo[indice2];
                    posicion = indice2;
                }
            }
            
            if (posicion != indice) 
            {
                temporal1 = arreglo[indice];
                arreglo[indice] = arreglo[posicion];
                arreglo[posicion] = temporal1;                
            }
        }
        return arreglo;
    }

}

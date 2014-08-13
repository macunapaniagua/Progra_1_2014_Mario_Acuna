/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author Mario A
 */
public class MetodosArreglos {

    public MetodosArreglos() {

    }

    public int sumarElementos(int[] pArreglo) {
        int suma = 0;
        for (int i = 0; i < pArreglo.length; i++) {
            suma += pArreglo[i];
        }
        return suma;
    }

    public int sumarMayores36(int[] pArreglo) {
        int suma = 0;
        for (int i = 0; i < pArreglo.length; i++) {
            if (pArreglo[i] > 36) {
                suma += pArreglo[i];
            }
        }
        return suma;
    }

    public int sumarMayores50(int[] pArreglo) {
        int suma = 0;
        for (int i = 0; i < pArreglo.length; i++) {
            if (pArreglo[i] > 50) {
                suma += pArreglo[i];
            }
        }
        return suma;
    }

    public int[] sumarArreglos(int[] primero, int[] segundo) {

        int[] resultado = new int[primero.length];
        for (int i = 0; i < primero.length; i++) {
            resultado[i] = primero[i] + segundo[i];
        }
        return resultado;
    }

    public String mejorCurso(int[] primero, int[] segundo) {

        int resultadoA = 0;
        int resultadoB = 0;

        for (int i = 0; i < primero.length; i++) {
            resultadoA += primero[i];
        }
        for (int i = 0; i < segundo.length; i++) {
            resultadoB += segundo[i];
        }

        if (resultadoA >= resultadoB) {
            return "Las notas del curso A son mejores que las del curso B";
        } else {
            return "Las notas del curso B son mejores que las del curso A";
        }
    }

    public boolean estaOrdenado(int[] arreglo) {
        
        int valorAnterior = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (valorAnterior > arreglo[i]) 
                return false;
            else
                valorAnterior = arreglo[i];
        }
        return true;
    }

}

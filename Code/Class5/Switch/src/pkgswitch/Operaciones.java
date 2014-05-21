/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

/**
 *
 * @author Mario A
 */
public class Operaciones {
    
    public double sumar(double valor1, double valor2){
        return valor1 + valor2; 
    }
    
    public double resta(double valor1, double valor2){
        return valor1 - valor2;
    }
    
    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
    
    public double dividir(double valor1, double valor2){
        if(valor2 != 0)
            return valor1 / valor2;
        else
            return 0;
    }
    
    public double potencia(double valor1, double valor2){
        return Math.pow(valor1, valor2);
    }
    
    public double raiz(double valor){
        return Math.sqrt(valor);
    }
    
}

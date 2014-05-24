/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.pkgswitch;

/**
 *
 * @author Mario A
 */
public class Terminacion {
    
    public int evalTerminacion(int pNumero){
    
        char ultimoNumero;
        int respuesta;
        int terminacion = pNumero % 10;
        
        if ((terminacion == 2) || (terminacion == 5) || (terminacion == 8))
            ultimoNumero = 'c';
        else if ((terminacion == 4) || (terminacion == 7) || (terminacion == 9))
            ultimoNumero = 'm';
        else
            ultimoNumero = 'i';
        
        switch(ultimoNumero){
            case 'c':
                respuesta = (int) Math.pow(pNumero,2);
                break;
            case 'm':
                respuesta = pNumero * 5;
                break;
            default:
                respuesta = pNumero;
        }
        return respuesta;
    }
}

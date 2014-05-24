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
public class Notas {
    
    public String getRendimiento(char pNota){
        
        String respuesta;
        switch (Character.toLowerCase(pNota)){
            case 'a':
                respuesta = "excelente";
                break;
            case 'b':
                respuesta = "bueno";
                break;
            case 'c':
                respuesta = "regular";
                break;
            case 'd':
                respuesta = "malo";
                break;
            case 'e':
                respuesta = "pesimo";
                break;
            default:
                respuesta = null;
        }
        return respuesta;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class7;

/**
 *
 * @author Mario A
 */
public class Ejercicio2 {
    
    private String cadena;
    
    public String mediaCadena()
    {
        String retorno = "";
        for (int i = 0; i < getCadena().length()/2; i++) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }
    
    public char ultimoValor(){
        return getCadena().charAt(getCadena().length()-1);
    }
    
    public String Alrevez()
    {
        String retorno = "";
        for (int i = getCadena().length()-1; i >=0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }
    
    public int contarVocales(){        
        int cantidad = 0;
        
        for (int i = 0; i < getCadena().length(); i++) {            
            char letra = Character.toLowerCase(getCadena().charAt(i));            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cantidad++;
            }            
        }
        return cantidad;
    }
    
    public String conGuion(){
        String retorno = "";        
        for (int i = 0; i < getCadena().length(); i++) {
            retorno += getCadena().charAt(i);
            if(i != (getCadena().length()-1)){
                retorno += "-";
            }            
        }
        return retorno;
    }
    
    public boolean Palindromo(){
        
        String palabraAlRevez = this.Alrevez();
        
        if(getCadena().equals(palabraAlRevez))
            return true;
        else
            return false;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}

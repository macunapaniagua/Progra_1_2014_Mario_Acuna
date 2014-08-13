/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8;

/**
 *
 * @author Mario A
 */
public class claseString {

    private String cadena;

    /**
     * Metodo para obtener un substring a partir de los indices dados
     *
     * @param begin indice inicial
     * @param end indice final
     * @return substring
     */
    public String subString(int begin, int end) {
        String subCadena = "";
        if (begin > end || end >= getCadena().length() || end < 0 || begin < 0) {
            return null;
        } else {
            for (; begin <= end; begin++) {
                subCadena += getCadena().charAt(begin);
            }
        }
        return subCadena;
    }

    /**
     * Metodo que convierte a mayuscula todas las letras del String
     *
     * @return cadena en mayuscula
     */
    public String toUpperCase() {
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {
            // Optengo el valor entero del caracter en la posicion i
            int valorCaracter = getCadena().charAt(i);
            // Verifica si es una letra minuscula para cambiarla a mayuscula en ASCCI
            if (valorCaracter < 122 && valorCaracter > 96) {
                // La mayuscula en ASCCI esta 32 caracteres antes
                valorCaracter -= 32;
                // Convierte el numero a caracter nuevamente
                char representacion = (char) valorCaracter;
                retorno += representacion;
            } else {
                retorno += getCadena().charAt(i);
            }
        }
        return retorno;
    }

    /**
     * metodo que retorna el string que representa a un numero entero dado
     *
     * @param i numero entero
     * @return representacion del numero entero
     */
    public String valueOf(int i) {
        String valorString = i + "";
        return valorString;
    }

    /**
     * Metodo que retorna el indice donde se ubica el substring ingresado.
     * @param str string a buscar
     * @param from indice donde iniciiara la busqueda
     * @return el indice donde se encuentra la cadena o -1 si no se encuentra
     */
    public int indexOf(String str, int from) 
    {
        // Se recorre la cadena desde from hasta el largo de la cadena
        for (int i = from; i < getCadena().length(); i++) 
        {
            if (getCadena().charAt(i) == str.charAt(0)) 
            {
                // Los caracteres son iguales, entonces guarda la posicion del
                // primer elemento
                int indiceInicial = i;
                // Recorre las dos cadenas para comprobar que todos los caracteres
                // son iguales. Inicia en 1 porque ya sabemos que el 0 es igual.
                for (int j = 1; j < str.length(); j++) 
                {
                    // Verifica que exista un elemento siguiente para comparar, 
                    // en la cadena original. En caso contrario, ejecutara el 
                    // break y saldra de los dos for, para luego retornar -1
                    if(i < getCadena().length() -1){
                        i++;
                    }
                    else{
                        break;
                    }                    
                    
                    // Verifica si los caracteres en la posicion correspondiente
                    // en cada cadena, son iguales, en caso contrario, sale del 
                    // segundo ciclo for.
                    if (getCadena().charAt(i) == str.charAt(j)) {
                        
                        // Verifica si se llego al final del la cadena buscada, en
                        // caso de que haya ocurrido, la palabra fue encontrada y
                        // se retornara el indice de la posicion inicial.
                        if (j == str.length() - 1) {
                            return indiceInicial;
                        }
                    }else
                    {
                        break;
                    }
                }
            }
        }
        return -1;
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

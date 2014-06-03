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
public class methodsString {

    /**
     * Metodo para invertir los caracteres en la palabra dada
     *
     * @param pPalabra Palabra a invertir
     * @return palabra invertida
     */
    public String rotarPalabra(String pPalabra) {
        String inversa = "";
        for (int i = pPalabra.length() - 1; i >= 0; i--) {
            inversa += pPalabra.charAt(i);
        }
        return inversa;
    }

    /**
     * Metodo que convierte una palabra dada en un palindromo
     *
     * @param pPalabra Palabra a convertir
     * @return Palindromo
     */
    public String convertirAPalindromo(String pPalabra) {
        for (int i = pPalabra.length() - 2; i >= 0; i--) {
            pPalabra += pPalabra.charAt(i);
        }
        return pPalabra;
    }

    /**
     * Metodo que agrega un guion en la primera aparicion de una palabra dada
     *
     * @param pTexto Texto donde se buscara la palabra
     * @param pPalabra Palabra a buscar
     * @return El texto con el guion en la primera aparicion
     */
    public String buscarPalabra(String pTexto, String pPalabra) {
        String retorno;
        int i = pTexto.indexOf(pPalabra);

        if (i == -1) {
            // No existe la palabra en el texto dado
            return pTexto;
        } else {
            // Se agrega un guion entre las dos subcadenas.
            retorno = pTexto.substring(0, i) + '-' + pTexto.substring(i);
            return retorno;
        }
    }

    /**
     * Metodo que agrega un guion antes de una palabra dada. Esto lo realiza
     * para todas las apariciones de la palabra en la cadena
     *
     * @param pTexto Texto en el que se buscara la palabra
     * @param pPalabra Palabra a buscar
     * @return Retorna el texto con guiones en caso de que la palabra exista
     */
    public String buscarPalabraConFor(String pTexto, String pPalabra) {

        String retorno = "";
        String subCadena = "";

        for (int i = 0; i < pTexto.length(); i++) {
            // Condicion para verificar si el caracter analizado es el fin de la
            // cadena o si el caracter es un espacio vacio, lo que indica que la
            // palabra analizada ya se ha formado para su comparacion.
            if (pTexto.charAt(i) == ' ' || i == pTexto.length() - 1) {
                // Si es el ultimo caracter lo agrega a la subcadena a comparar
                if ((pTexto.length() - 1) == i) {
                    subCadena += pTexto.charAt(i);
                }

                // Compara la palabra con la subcadena. En caso que sean iguales
                // agrega un guion, la palabra y un espacio. En caso contrario, 
                // solo agrega la palabar y un espacio.
                if (pPalabra.equals(subCadena)) {
                    retorno += "-" + subCadena + " ";
                    subCadena = "";
                } else {
                    retorno += subCadena + " ";
                    subCadena = "";
                }
            } else {
                // Agrega el caracter analizado a la subcadena
                subCadena += pTexto.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * Metodo que indica cuantas veces aparece una palabra en un texto dado
     *
     * @param pTexto Texto en el que se buscara la palabra
     * @param pPalabra Palabra a buscar
     * @return cantidad de ocurrencias
     */
    public int cantidadOcurrencias(String pTexto, String pPalabra) {
        int cantidadApariciones = 0;
        String subCadena = "";

        for (int i = 0; i < pTexto.length(); i++) {
            // Condicion para verificar si el caracter analizado es el fin de la
            // cadena o si el caracter es un espacio vacio, lo que indica que la
            // palabra analizada ya se ha formado para su comparacion.
            if (pTexto.charAt(i) == ' ' || i == pTexto.length() - 1) {
                // Si es el ultimo caracter lo agrega a la subcadena a comparar
                if ((pTexto.length() - 1) == i) {
                    subCadena += pTexto.charAt(i);
                }

                // Compara la palabra con la subcadena. 
                if (pPalabra.equals(subCadena)) {
                    cantidadApariciones++;
                }
                subCadena = "";
            } else {
                // Agrega el caracter analizado a la subcadena
                subCadena += pTexto.charAt(i);
            }
        }
        return cantidadApariciones;
    }
}

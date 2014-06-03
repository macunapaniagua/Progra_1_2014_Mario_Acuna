/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice8;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class Practice8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        methodsString oMetodos = new methodsString();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(oMetodos.rotarPalabra("mario"));
        System.out.println(oMetodos.convertirAPalindromo("mario"));
        System.out.println(oMetodos.buscarPalabra("habian autos muchos autos", "autos"));
        System.out.println(oMetodos.buscarPalabraConFor("habian autos muchos autos", "autos"));
        System.out.println(oMetodos.cantidadOcurrencias("habian autos autociclo autos muchos autos", "autos"));
        
    }
    
}

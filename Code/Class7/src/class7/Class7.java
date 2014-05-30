/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;

        Scanner oScanner = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion que desea:");
            System.out.println("1. Ejercicio1");
            System.out.println("2. Ejercicio2");
            opcion = oScanner.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    Ejercicio1 oEjercicio1 = new Ejercicio1(oScanner.nextLine());
                    System.out.println(oEjercicio1.validarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oScanner = new Scanner(System.in);
                    oEjercicio2.setCadena(oScanner.nextLine());
                    System.out.print("La primera mitad de la cadena es: ");
                    System.out.println(oEjercicio2.mediaCadena());
                    System.out.print("El ultimo valor de la cadena es: ");
                    System.out.println(oEjercicio2.ultimoValor());
                    System.out.print("La palabra al revez es: ");
                    System.out.println(oEjercicio2.Alrevez());
                    System.out.println("La cantidad de vocales presentes es: " + oEjercicio2.contarVocales());
                    System.out.println("La palabra con guiones es: " + oEjercicio2.conGuion());
                    System.out.print("La palabra es un palindromo?: ");
                    System.out.println(oEjercicio2.Palindromo());                                      
                    break;                
            }
        } while (opcion <= 2);

    }

}

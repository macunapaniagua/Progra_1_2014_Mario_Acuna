/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        double salario = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");

            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oEjercicio1 = new ejercicio1();

                    for (int i = 0; i < 6; i++) 
                    {
                        System.out.println("Digite el salario del trabajador " + (i + 1));
                        salario = teclado.nextDouble();
                        oEjercicio1.agregarSalario(salario);
                    }
                    break;
                case 2:
                    ejercicio2 oEjercicio2 = new ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite la altura de la person " + (i + 1));
                        oEjercicio2.agregarAlturas(teclado.nextFloat());
                    }
                    System.out.println("El promedio es: " + oEjercicio2.promedio());
                    System.out.println(oEjercicio2.contarPersonas());
                    break;
                case 3:
                    ejercicio3 oEjercicio3 = new ejercicio3();
                    for (int i = 0; i < 8; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario de la person " + (i + 1));
                        oEjercicio3.almacenarSalario(teclado.nextFloat());
                    }
                    System.out.println(oEjercicio3.imprimirSalarios());
                    break;
                default:
                    break;
            }
        } while (opcion < 5);

    }

}

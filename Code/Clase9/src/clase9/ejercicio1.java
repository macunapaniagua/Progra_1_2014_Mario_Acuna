/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author Mario A
 */
public class ejercicio1 {

    private double[] salarios = new double[5];

    public void agregarSalario(double salario) {

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] == 0) {
                salarios[i] = salario;
                break;
            }
        }
    }

    public String imprimirSueldos() {
        String imprimir = "";
        for (int i = 0; i < salarios.length; i++) {
            imprimir += "El salario de la posicion " + (i + 1) + " es de " + salarios[i] + "/n";
        }
        return imprimir;
    }
}

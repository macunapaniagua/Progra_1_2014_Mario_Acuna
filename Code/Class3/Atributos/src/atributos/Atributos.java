/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

import java.util.Scanner;

/**
 *
 * @author Mario Acuna
 */
public class Atributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        char continuar;
        int opcion;
        double monto;

        Scanner teclado = new Scanner(System.in);
        Account oAccount = new Account();



        while (validar) {
            System.out.println("Digite 1 si quiere realizar un deposito y 2 "
                    + "si quiere realizar un retiro");
            opcion = Integer.parseInt(teclado.nextLine());

            if (opcion == 1) {
                System.out.println("Digite el monto a depositar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
            } else if (opcion == 2) {
                System.out.println("Digite el monto a retirar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                if (oAccount.isHayError()) {
                    System.out.println("El monto a retirar, no puede ser "
                            + "retirardo");
                    oAccount.setHayError(false);
                }
            }

            System.out.println("El saldo final es de " + oAccount.getSaldoInicial());
            System.out.println("Desea continuar con otra transaccion? S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's'))
                validar = true;
            else if ((continuar == 'N') || (continuar == 'n'))
                validar = false;
        }
    }
}

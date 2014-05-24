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
public class DiasDelMes {

    public int calcularDias(int pMes, int pYear) {

        int numeroDias = 0;

        if (pYear < 0) {
            return -1;
        }

        switch (pMes) {
            case 1:
                numeroDias = 31;
                break;
            case 2:
                numeroDias = 28;
                break;
            case 3:
                numeroDias = 31;
                break;
            case 4:
                numeroDias = 30;
                break;
            case 5:
                numeroDias = 31;
                break;
            case 6:
                numeroDias = 30;
                break;
            case 7:
                numeroDias = 31;
                break;
            case 8:
                numeroDias = 31;
                break;
            case 9:
                numeroDias = 30;
                break;
            case 10:
                numeroDias = 31;
                break;
            case 11:
                numeroDias = 30;
                break;
            case 12:
                numeroDias = 31;
                break;
            default:
                return -1;
        }        
        if ((pYear%4 == 0) && (pMes == 2))
            numeroDias++;
        
        return numeroDias;
    }
}

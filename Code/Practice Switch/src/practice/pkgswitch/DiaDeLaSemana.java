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
public class DiaDeLaSemana {

    public String diaFecha(int pFecha) {

        String dia;
        int diaActual;

        if (pFecha <= 30 && pFecha > 0) {
            diaActual = pFecha % 7;
        } else {
            diaActual = pFecha;
        }

        switch (diaActual) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sabado";
                break;
            case 0:
                dia = "domingo";
                break;
            default:
                dia = null;
        }
        return dia;
    }

    public String diaFecha(String pDia1, int pFecha) {

        String respuesta = "";
        int diaActual;

        if (pFecha <= 30 && pFecha > 0) {
            diaActual = pFecha % 7;
        } else {
            return null;
        }

        switch (pDia1.toLowerCase()) {
            case "lunes":
                switch (diaActual) {
                    case 1:
                        respuesta = "lunes";
                        break;
                    case 2:
                        respuesta = "martes";
                        break;
                    case 3:
                        respuesta = "miercoles";
                        break;
                    case 4:
                        respuesta = "jueves";
                        break;
                    case 5:
                        respuesta = "viernes";
                        break;
                    case 6:
                        respuesta = "sabado";
                        break;
                    case 7:
                        respuesta = "domingo";
                        break;
                }
                break;

            case "martes":
                switch (diaActual) {
                    case 1:
                        respuesta = "martes";
                        break;
                    case 2:
                        respuesta = "miercoles";
                        break;
                    case 3:
                        respuesta = "jueves";
                        break;
                    case 4:
                        respuesta = "viernes";
                        break;
                    case 5:
                        respuesta = "sabado";
                        break;
                    case 6:
                        respuesta = "domingo";
                        break;
                    case 7:
                        respuesta = "lunes";
                        break;
                }
                break;

            case "miercoles":
                switch (diaActual) {
                    case 1:
                        respuesta = "miercoles";
                        break;
                    case 2:
                        respuesta = "jueves";
                        break;
                    case 3:
                        respuesta = "viernes";
                        break;
                    case 4:
                        respuesta = "sabado";
                        break;
                    case 5:
                        respuesta = "domingo";
                        break;
                    case 6:
                        respuesta = "lunes";
                        break;
                    case 7:
                        respuesta = "martes";
                        break;
                }
                break;

            case "jueves":
                switch (diaActual) {
                    case 1:
                        respuesta = "jueves";
                        break;
                    case 2:
                        respuesta = "viernes";
                        break;
                    case 3:
                        respuesta = "sabado";
                        break;
                    case 4:
                        respuesta = "domingo";
                        break;
                    case 5:
                        respuesta = "lunes";
                        break;
                    case 6:
                        respuesta = "martes";
                        break;
                    case 7:
                        respuesta = "miercoles";
                        break;
                }
                break;

            case "viernes":
                switch(diaActual){
                    case 1:
                        respuesta = "viernes";
                        break;
                    case 2:
                        respuesta = "sabado";
                        break;
                    case 3:
                        respuesta = "domingo";
                        break;
                    case 4:
                        respuesta = "lunes";
                        break;
                    case 5:
                        respuesta = "martes";
                        break;
                    case 6:
                        respuesta = "miercoles";
                        break;
                    case 7:
                        respuesta = "jueves";
                        break;                        
                }
                break;

            case "sabado":
                switch(diaActual){
                    case 1:
                        respuesta = "sabado";
                        break;
                    case 2:
                        respuesta = "domingo";
                        break;
                    case 3:
                        respuesta = "lunes";
                        break;
                    case 4:
                        respuesta = "martes";
                        break;
                    case 5:
                        respuesta = "miercoles";
                        break;
                    case 6:
                        respuesta = "jueves";
                        break;
                    case 7:
                        respuesta = "viernes";
                        break;                        
                }
                break;

            case "domingo":
                switch(diaActual){
                    case 1:
                        respuesta = "domingo";
                        break;
                    case 2:
                        respuesta = "lunes";
                        break;
                    case 3:
                        respuesta = "martes";
                        break;
                    case 4:
                        respuesta = "miercoles";
                        break;
                    case 5:
                        respuesta = "jueves";
                        break;
                    case 6:
                        respuesta = "viernes";
                        break;
                    case 7:
                        respuesta = "sabado";
                        break;                                            
                }
                break;
            
            default:
                respuesta = null;
        }

        return respuesta;
    }
}

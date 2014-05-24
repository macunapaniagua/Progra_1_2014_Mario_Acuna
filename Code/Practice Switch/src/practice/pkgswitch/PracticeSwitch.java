/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkgswitch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class PracticeSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String respuesta;

        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);

        DiaAnterior oAnterior = new DiaAnterior();
        DiaDeLaSemana oPrimerDia = new DiaDeLaSemana();
        DiasDelMes oDiaMes = new DiasDelMes();
        Meses oMes = new Meses();
        Notas oCalificacion = new Notas();
        NumerosRomanos oRomanos = new NumerosRomanos();
        Terminacion oTerminacion = new Terminacion();

        /* ---------------------- EJERCICIO 1 ----------------------------------
         * Ingresar un número entre 1 y 12 y reportar el mes que le corresponde
         */
        System.out.println("Digite el numero correspondiente a un mes");
        int mes = Integer.parseInt(teclado.nextLine());
        respuesta = oMes.reportarMes(mes);

        if (respuesta != null) {
            System.out.println("El numero ingresado corresponde al mes " + respuesta + "\n");
        } else {
            System.out.println("El numero ingresado es invalido\n");
        }

        /* ---------------------- EJERCICIO 2 ----------------------------------
         * Ingresar un numero entero, y si este termina en 2,5 u 8 reportar el 
         * cuadrado del número, si este termina en 4,7 o 9 reportar el numero 
         * multiplicado por 5 y reportar el mismo número en otro caso.
         */
        
        System.out.println("Digite un numero entero a evaluar");
        int numero = Integer.parseInt(teclado.nextLine());
        
        System.out.println("La operacion correspondiente al numero por su "
                + "terminacion da como resultado " + oTerminacion.evalTerminacion(numero) + "\n");
        
        /* ---------------------- EJERCICIO 3 ----------------------------------
            Ingresar una letra entre a y e y reportar el mensaje de acuerdo a:
            A excelente
            B bueno
            C regular
            D malo
            E pésimo
         */
        
        System.out.println("Digite una calificacion literal");
        char nota = teclado.nextLine().charAt(0);
        respuesta = oCalificacion.getRendimiento(nota);
        
        if(respuesta == null)
            System.out.println("La calificacion ingresada es invalida\n");
        else
            System.out.println("Su rendimiento es " + respuesta +"\n");
        
        /* ---------------------- EJERCICIO 4 ----------------------------------
            Ingresar el número de mes y el año y reporte el número de días que 
            tiene ese mes.
        */
        System.out.println("Digite el numero del mes para saber cuantos dias posee");
        int diasMes = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el año a analizar");
        int diasAño = Integer.parseInt(teclado.nextLine());
        
        int res = oDiaMes.calcularDias(diasMes, diasAño);
        if(res == -1){
            System.out.println("Los datos ingresados son erroneos\n");
        }
        else{
            System.out.println("El mes tiene " + res + " dias\n");
        }                       
        
        /* ---------------------- EJERCICIO 5 ----------------------------------
            Generar un número aleatorio entre 1 y 3000, mostrarlo en la pantalla
            y reportar su equivalente en números romanos.
        */
        
        int numRand = rand.nextInt(3000)+1;
        System.out.println("El numero " + numRand + " se representa como " +
                oRomanos.toNumeroRomano(numRand) + " en numeros romanos\n");
        
        /* ---------------------- EJERCICIO 6 ----------------------------------
            Dados como entrada 3 enteros representando la fecha como día, mes, 
            año, imprimir la fecha del día anterior. Por ejemplo para una 
            entrada como: 1, 3,1992 La salida será: Fecha anterior a 1-3-1992 
            es 29-02-1992.
        */        
        System.out.println("Digite el dia del año");
        int day = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el mes del año");
        int month = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el año");
        int year = Integer.parseInt(teclado.nextLine());
        
        String fecha = day + "/" + month + '/' + year;
        respuesta = oAnterior.getDiaAnterior(day, month, year);
        
        if(respuesta == null)
            System.out.println("Los datos ingresados no concuerdan\n");
        else
            System.out.println("Fecha anterior a " + fecha + " es " + respuesta + "\n");
        
        /* ---------------------- EJERCICIO 7 ----------------------------------
            Ingresar día de una fecha, reportar el día de la semana que le 
            corresponde, suponiendo que el día 1 de dicho mes fue lunes.
        */
        System.out.println("Digite un numero del dia del mes");
        int diaMonth = Integer.parseInt(teclado.nextLine());
        
        respuesta = oPrimerDia.diaFecha(diaMonth);
        if(respuesta == null){
            System.out.println("El dia ingreresado es invalido\n");
        }else{
            System.out.println("El dia es " + respuesta);
        }
            
        /* ---------------------- EJERCICIO 8 ----------------------------------
            Preguntar qué día de la semana fue el día 1 del mes actual y 
            reportar el día de la semana que es hoy.
        */
        System.out.println("Digite el primer dia de la semana (en minuscula)");
        String primerDia = teclado.nextLine();
        System.out.println("Digite un dia de la semana que es hoy");
        int DiaHoy = Integer.parseInt(teclado.nextLine());
        
        respuesta = oPrimerDia.diaFecha(primerDia, DiaHoy);
        
        if(respuesta == null){
            System.out.println("El dia o mes ingreresado es invalido\n");
        }else{
            System.out.println("El dia es " + respuesta);
        }        
    }
}
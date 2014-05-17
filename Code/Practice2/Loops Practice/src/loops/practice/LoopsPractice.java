/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loops.practice;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class LoopsPractice {

    // Variable declaration        
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoopsPractice ciclos = new LoopsPractice();
        ciclos.ejercicio1();
        ciclos.ejercicio2();
        ciclos.ejercicio3();
        ciclos.ejercicio4();
        ciclos.ejercicio5();
        ciclos.ejercicio6();
        ciclos.ejercicio7();
        ciclos.ejercicio8();
        ciclos.ejercicio9();
        ciclos.ejercicio10();
        ciclos.ejercicio11();
        ciclos.ejercicio12();
        ciclos.ejercicio13();
        ciclos.ejercicio14();
        ciclos.ejercicio15();
    }
    
    public static void ejercicio1(){     
        
        int numeroIngresado;
        
        // Request a number to the user
        System.out.println("Digite el numero de asteriscos que desea visualizar");
        numeroIngresado = Integer.parseInt(teclado.nextLine());
        
        // Bucle for wich writes asterisks 
        for(int i = 0; i< numeroIngresado; i++){
            System.out.print("*");
        }        
        System.out.println("\n");
    }
    
    public static void ejercicio2(){
        
        int valorN, valorY;
        
        // Request the numbers
        System.out.println("Digite el primer numero N");
        valorN = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el segundo numero Y");
        valorY = Integer.parseInt(teclado.nextLine());
        
        // Bucle wich write stars when the number Y is a divisor of Y
        int cont = 1;
        
        while(cont <= valorN){
            if(cont % valorY != 0)
                System.out.print(cont); 
            else
                System.out.print('*');
            cont++;
        }
        System.out.println("\n");
    }
    
    public static void ejercicio3(){
        double inicioSerie;
        System.out.println("Digite un valor inicial");
        inicioSerie = Double.parseDouble(teclado.nextLine());
        
        double finSerie;
        System.out.println("Digite un valor final");
        finSerie = Double.parseDouble(teclado.nextLine());
        
        double incremento;
        System.out.println("Digite el valor del incremento");
        incremento = Double.parseDouble(teclado.nextLine());
        
        for (;inicioSerie<= finSerie; inicioSerie += incremento) {
            System.out.print(inicioSerie);
            System.out.print(" - ");
        }
        System.out.println("\n");       
    }
    
    public static void ejercicio4(){
        int indiceElemento = 3;
        int finPadovan;
                
        System.out.println("Digite cuantos elementos de la serie de Padovan "
                + "desea visualizar (mayor de 3)");
        finPadovan = Integer.parseInt(teclado.nextLine());
        
        int[] sucesionPadovan = new int[finPadovan];        
        sucesionPadovan[0] = 1;
        sucesionPadovan[1] = 1;
        sucesionPadovan[2] = 1;
        
        System.out.print(String.valueOf(sucesionPadovan[0]) + ',' 
                + String.valueOf(sucesionPadovan[1]) + ',' 
                + String.valueOf(sucesionPadovan[2]));
        do {
            sucesionPadovan[indiceElemento] = sucesionPadovan[indiceElemento-2] 
                    + sucesionPadovan[indiceElemento-3];
            System.out.print(',' + String.valueOf(sucesionPadovan[indiceElemento]));
            indiceElemento++;
                        
        } while (indiceElemento < finPadovan);
        System.out.println("\n");        
    }
    
    public static void ejercicio5(){
        System.out.println("Digite un numero decimal que desea elevar");
        double numDecimal = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Digite la potencia a la que desea elevar el numero");
        int potencia = Integer.parseInt(teclado.nextLine());
        
        double resultadoPotencia = 1;
        int contador = 1;
        
        while(contador <= potencia){
            resultadoPotencia *= numDecimal;
            contador++;
        }
        
        System.out.println("El resultado es: " + resultadoPotencia);        
    }
    
    public static void ejercicio6(){
        for (int i1 = 0; i1 <= 9; i1++) {
            for (int i2 = 0; i2 <= 9; i2++) {
                for (int i3 = 0; i3 <= 9; i3++) {
                    for (int i4 = 0; i4 <= 9; i4++) {
                        for (int i5 = 0; i5 <= 9; i5++) {
                            System.out.println(String.valueOf(i1) + String.valueOf(i2)
                            + String.valueOf(i3) + String.valueOf(i4) + String.valueOf(i5));    
                        }
                    }
                }
            }
        }        
    }
    
    public static void ejercicio7(){
        int numPares, numImpares;
        numImpares = numPares = 0;
        char salir = 'N';
        
        while(Character.toUpperCase(salir) == 'N'){
            
            System.out.println("Digite un numero entero");
            int temp = Integer.parseInt(teclado.nextLine());
            
            if(temp % 2 == 0){
                numPares++;
            }else{
                numImpares++;
            }
            
            System.out.println("Desea dejar de ingresar numeros. S/N");
            salir = teclado.nextLine().charAt(0);
        }
        
        System.out.println("Se ingreso " + numPares + " numeros pares y "
            + numImpares + " numeros impares\n");         
    }
    
    public static void ejercicio8(){
        int numeroTabla;
        int contadorTabla = 1;
        
        System.out.println("Digite el numero al que desea visualizar la tabla de"
                + "multiplicar");
        numeroTabla = Integer.parseInt(teclado.nextLine());
        
        System.out.println("\nCon Ciclo Do While");
        do{
            System.out.println(numeroTabla + " X " + contadorTabla + " = " 
                    + (contadorTabla*numeroTabla));
            contadorTabla++;
        }while(contadorTabla <= 10);
        
        System.out.println("\nCon Ciclo For");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " X " + i + " = " 
                    + (i*numeroTabla));
        }
        
        System.out.println("\nCon Ciclo While");
        
        contadorTabla = 1;
        while(contadorTabla <= 10){
            System.out.println(numeroTabla + " X " + contadorTabla + " = " 
                    + (contadorTabla*numeroTabla));
            contadorTabla++;
        }   
    }
    
    public static void ejercicio9(){
        int acumuladoPromedio = 0;
        int cont = 1;
        while(cont <= 10){
            System.out.println("Digite un numero entero");
            acumuladoPromedio += Integer.parseInt(teclado.nextLine());
            cont++;
        }        
        System.out.println("El promedio es " + (acumuladoPromedio/10));        
    }
    
    public static void ejercicio10(){
        int cantidadNotas = 0;
        int promedioNotas = 0;
        int nuevaNota;
        
        do{
            System.out.println("Digite una nota. La nota igual a 0 es para salir");
            nuevaNota = Integer.parseInt(teclado.nextLine());
            cantidadNotas++;
            promedioNotas += nuevaNota;
        }while(nuevaNota != 0);
        
        System.out.println("El promedio de los " + cantidadNotas + " elementos"
                + "ingresados es de " + (float)(promedioNotas/cantidadNotas));        
    }
    
    public static void ejercicio11(){
        for(int i=1; i<= 10; i++){
            System.out.println(i + " dolares equivalen a " + (i*560) + " colones");
        }        
    }
    
    public static void ejercicio12(){
        double interes = 0;
        double saldo = 1000;
        
        System.out.println("Saldo inicial: " + saldo);
        for (int i = 1; i <= 12; i++) {
            interes = saldo*0.02;
            saldo += interes;
            System.out.println("Saldo al mes " + i + ": " + saldo);
        }        
    }
    
    public static void ejercicio13(){
        int relojHora = 0, relojMinutos = 0, relojSegundos = 0;
        
        while (true) {
            System.out.println("Hora: " + relojHora + ":" + relojMinutos + ":"
                    + relojSegundos);

            if ((relojSegundos + 1) == 60) {
                if ((relojMinutos + 1) == 60) {
                    if ((relojHora + 1) == 24) {
                        relojHora = 0;
                        relojMinutos = 0;
                        relojSegundos = 0;
                    } else {
                        relojHora++;
                        relojMinutos = relojSegundos = 0;
                    }
                } else {
                    relojSegundos = 0;
                    relojMinutos++;
                }
            } else {
                relojSegundos++;
            }
        }        
    }
    
    public static void ejercicio14(){
        int meses = 0; 
        double interes = 0;
        double saldo = 1000;
        
        System.out.println("Saldo inicial: " + saldo);
        while (saldo < 2500) {
            interes = saldo*0.02;
            saldo += interes;
            meses++;
            System.out.println("Saldo actual " + saldo);
        }
        System.out.println("En " + meses + " meses se obtuvo $1500");        
    }
    
    public static void ejercicio15(){
        String impares = "";
        int siguienteImpar = 1;
        int nImpares;
        
        System.out.println("Digite la cantidad de numeros impares que desea ver");
        nImpares = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < nImpares; i++) {
            System.out.println(impares + siguienteImpar);
            impares = impares + siguienteImpar + " " ;
            siguienteImpar += 2;
        }        
    }
}

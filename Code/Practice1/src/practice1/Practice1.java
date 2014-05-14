/*
    * Name: Practice1

    * Information: This is the first practice.

    * Date: 9/05/2014

    * Version: 1.0

 */

package practice1;

import java.util.Scanner;

/**
 *
 * @author Mario A
 */
public class Practice1 {
    
    Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Practice1 myInstance = new Practice1();
        
        myInstance.firstExercise();
        myInstance.secondExercise();
        myInstance.thirdExercise();
        myInstance.fourthExercise();
        myInstance.fifthExercise();
        myInstance.sixthExercise();
        myInstance.seventhExercise();
        
    }
    
    // Exercise number 1
    public void firstExercise(){
        
        // Variable declaration
        int N;
        double A;
        char C;
        
        // Request the user to enter some values from the keyboard
        System.out.println("Digite un numero entero (N)");
        N = teclado.nextInt();
        System.out.println("Digite un numero con decimales (A)");
        A = teclado.nextDouble();
        System.out.println("Digite un caracter (C)");
        C = teclado.next().charAt(0);
        
        // Show the values on screen
        System.out.println("\nLos valores ingresados para las variables son:"
                + "\n N = " + N + "\n A = " + A + "\n C = " + C);
        
        // Math operations between variables
        System.out.println("\nLa suma entre N + A es: " + (N + A));
        System.out.println("La diferencia de A - N es: " + (A - N));
        System.out.println("El valor numerico correspondiente a " + C + " es "
                + Character.getNumericValue(C));                 
    }
    
    // Exercise number 2
    public void secondExercise(){
        
        // Variable declaration
        int X, Y;
        double N, M;
        
        // Request values to the variables
        System.out.println("Ingrese un valor entero para la variable X");
        X = teclado.nextInt();
        System.out.println("Ingrese un valor entero para la variable Y");
        Y = teclado.nextInt();
        System.out.println("Ingrese un valor decimal para la variable N");
        N = teclado.nextDouble();
        System.out.println("Ingrese un valor decimal para la variable M");
        M = teclado.nextDouble();
        
        // Operations between variables
        System.out.println("\nLa suma de N + X es: " + (N + X));
        System.out.println("La division de Y / N es : " + (Y / N));
        System.out.println("La multiplicacion de X * M es " + (X * M));
        System.out.println("La resta de M - Y es: " + (M - Y));                
    }
    
    // Exercise number 3
    public void thirdExercise(){
        
        // Variable declaration
        int N;
        
        // Values request
        System.out.println("Digite un numeo entero (N)");
        N = teclado.nextInt();
        
        // Operations
        System.out.println("\nN incrementado en 77 unidades es: " + (N + 77));
        System.out.println("N decrementado en 3 unidades es: " + (N - 3));
        System.out.println("Al duplicar el valor de N se obtiene: " + (N * N));
    }
    
    // Exercise number 4
    public void fourthExercise(){
        
        // Variables declaration
        int A, B, C, D;
        
        // Values request
        System.out.println("Digite un numero entero (A)");
        A = teclado.nextInt();
        System.out.println("Digite un numero entero (B)");
        B = teclado.nextInt();
        System.out.println("Digite un numero entero (C)");
        C = teclado.nextInt();
        System.out.println("Digite un numero entero (D)");
        D = teclado.nextInt();
        
        // Variables before swapping values
        System.out.println("\nLos valores ingresados son: "
                + "A = " + A
                + ", B = " + B
                + ", C = " + C
                + ", D = " + D);
        
        // Swapping Values
        int swap;
        swap = B;
        B = C;
        C = A;
        A = D;
        D = swap;
        
        // Variables after swapping values
        System.out.println("\nLos valores despues del intercambio son:"
                + " A = " + A
                + ", B = " + B
                + ", C = " + C
                + ", D = " + D);
    }
    
    // Exercise number 5
    public void fifthExercise(){
        
        // Variable declaration
        int A;
        
        // Value request
        System.out.println("Digite un valor entero (A)");
        A = teclado.nextInt();
        
        // Comparison to discover if the number entered is pair or odd
        if (A%2 == 0 ){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
    // Exercise number 6
    public void sixthExercise(){
        
        // Variable declaration
        int B;
        
        // Value request
        System.out.println("Digite un valor entero (B)");
        B = teclado.nextInt();
        
        // Comparison to discover if the number entered is positive or negative
        if (B < 0 ){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es positivo");
        }        
    }
    
    // Exercise number 7
    public void seventhExercise(){
        
        // Variable declaration
        int C;
        
        // Value request
        System.out.println("Digite un valor entero (C)");
        C= teclado.nextInt();
        
        // Comparison to discover if the number entered is positive or negative
        if (C < 0 ){
            System.out.print("El numero ingresado es: negativo,");
        }else{
            System.out.print("El numero ingresado es: positivo,");
        } 
        
        // Comparison to discover if the number entered is pair or odd
        if (C%2 == 0 ){
            System.out.print(" par,");
        }else{
            System.out.print(" impar,");
        }  
        
        // Comparison to discover if the number is higher, lower or equal to 100
        if (C < 100){
            System.out.print(" menor que 100,");
        }else if (C > 100){
            System.out.print(" mayor que 100,");
        }else{
            System.out.print(" igual a 100,");
        }
        
        // Comparison to discover if the number is divisible by 5
        if (C % 5 == 0)
            System.out.println(" divisible por 5,");
        else
            System.out.println(" no es divisible por 5,");

        // Comparison to discover if the number is divisible by 5
        if (C % 10 == 0)
            System.out.println(" y divisible por 10");
        else
            System.out.println(" y no es divisible por 10");
        
    }
    
}

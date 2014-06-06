/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ejercicio3 {

    private float[] salarios = new float[8];
    
    public void almacenarSalario(float pSalario){
        for (int i = 0; i < salarios.length; i++) {
            if(salarios[i] == 0){
                salarios[i] = pSalario;
                break;
            }            
        }
    }
    
    public String imprimirSalarios(){
        String respuesta = "El salario de la tarde es de: ";
        float sumaSalario = 0;
        
        for(int i = 0; i < salarios.length/2; i++){
            sumaSalario += salarios[i];
        }
        
        respuesta += sumaSalario + " y el de la tarde es de: ";
        sumaSalario = 0;
        for(int i = salarios.length/2; i < salarios.length; i++){
            sumaSalario += salarios[i];
        }
        
        respuesta += sumaSalario;
        return respuesta;
    }
}

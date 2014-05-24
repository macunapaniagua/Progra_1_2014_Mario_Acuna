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
public class NumerosRomanos {    
    
    public String toNumeroRomano(int pNumero){
        
        String Romano = "";        
        
        String[] numerosRomanos = {"I","IV","V","IX","X","XL","L","XC","C", "CD", "D", "CM", "M"};
        int[] intRomanos = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000}; 
        
        int i = intRomanos.length-1;
        
        while(pNumero > 0){            
            if(pNumero >= intRomanos[i]){
                Romano += numerosRomanos[i];
                pNumero -= intRomanos[i];
            }
            else{
                i--;
            }
        }
        return Romano;
    }
    
}

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
public class DiaAnterior {
    
    public String getDiaAnterior(int pDia, int pMes, int pYear){
        
        String fechaAnterior;
        
        if ((pDia <= 0) || (pYear < 0))
            return null;
        
        switch (pMes) {
            case 1:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/12/" + (pYear - 1);
                }else
                    fechaAnterior = (pDia - 1) + "/01/" + pYear; 
                break;
            
            case 2:
                if ( (pDia > 29) || ( (pDia == 29) && (pYear % 4 != 0) ) ){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/1/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/2/" + pYear; 
                break;
            
            case 3:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    if(pYear % 4 == 0)
                        fechaAnterior = "29/2/" + (pYear);
                    else
                        fechaAnterior = "28/2/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/3/" + pYear; 
                break;
            
            case 4:
                if (pDia > 30){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/3/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/4/" + pYear; 
                break;
            
            case 5:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "30/4/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/5/" + pYear; 
                break;
            
            case 6:
                if (pDia > 30){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/5/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/6/" + pYear; 
                break;
            
            case 7:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "30/6/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/7/" + pYear; 
                break;
            
            case 8:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/7/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/8/" + pYear; 
                break;
            
            case 9:
                if (pDia > 30){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/8/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/9/" + pYear; 
                break;
                
            case 10:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "30/9/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/10/" + pYear; 
                break;
                
            case 11:
                if (pDia > 30){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "31/10/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/11/" + pYear; 
                break;
            
            case 12:
                if (pDia > 31){
                    fechaAnterior = null;
                }else if (pDia == 1){
                    fechaAnterior = "30/11/" + (pYear);
                }else
                    fechaAnterior = (pDia - 1) + "/12/" + pYear; 
                break;
            
            default:
                fechaAnterior = null;
        }
        
        return fechaAnterior;        
    }
}

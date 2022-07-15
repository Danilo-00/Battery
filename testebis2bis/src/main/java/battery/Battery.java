/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package battery;
              
/**
 *
 * @author Danilo
 */
public class Battery {
    public static void main(String[] args) {
        int n= 4;
        int[] eventos = new int[]{10, -20, 61, -15};
        
        getBattery(eventos);
        
        System.out.println("A Porcentagem de carga final é :" + getBattery(eventos) + "%");
    }
    
    public static int getBattery(int... eventos){
        int cargaFinal = 0, carga= 50;
        
        
        for (int i=0; i < eventos.length; i++){
            if((carga + eventos[i])> 100 ){
                carga = 100;
            }else{
                carga += eventos[i];
            }
            
            //System.out.println(carga);
            cargaFinal= carga;
        }
        
        //System.out.println("Carga Final =" + cargaFinal);
        return cargaFinal;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bayhon_quaderno_informatica;
import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Geometria {
    public void calcolo(){
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("quale figura vuoi scegliere tra ");
       System.out.println("1 rettangolo");
        System.out.println("2 quadrato");
         System.out.println("3 triangolo");
          System.out.println("inserire il seguente numero per la decisione");
          int scelta = scanner.nextInt();
           switch (scelta) {
      case 1:
        System.out.println("rettangolo");
        System.out.println("inserisci base");
        int b1 = scanner.nextInt();
        
        
        
        
        
        break;
      case 2:
        System.out.println("quadrato");
        
        
        break;
      case 3:
        System.out.println("triangolo");
        
        
        break;
          
         
        
        
                 
      }
      
    }
    
}

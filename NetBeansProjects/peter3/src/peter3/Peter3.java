/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peter3;

/**
 *
 * @author mulinge
 */
import java.util.Scanner;
public class Peter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.println("enter value");
        a=input.nextInt();
         System.out.println("enter value");
          b=input.nextInt();
          c=a+b;
         
          System.out.println("value= "+c);
          if (c<40)
                  {
                      System.out.println("gdade =d");
                  }
         
          else if(c<60) 
          {
              System.out.println("gdade =c");
          }
          else 
              System.out.println("gdade =a");
        // TODO code application logic here
    }
    
}

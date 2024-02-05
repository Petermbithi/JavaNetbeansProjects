/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author mulinge
 */
import java.util.Scanner;
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int base,height,area;
        System.out.println("enter the base");
        base=input.nextInt();
         System.out.println("enter the height");
          height=input.nextInt();
      area=base/2*height;
            System.out.println("the area is "+area);
        // TODO code application logic here
    }
    
}

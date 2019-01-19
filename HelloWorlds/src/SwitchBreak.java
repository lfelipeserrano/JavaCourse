/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
import java.util.Scanner;
public class SwitchBreak {
    public static void main(String args[]){
        int i;
        
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        char operator = sc.next().charAt(0);
        sc.close();
        
        
        switch(i){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            default:
                System.out.println("Case default");
        }
    }
    
}

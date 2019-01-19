/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class OperadoresDeAsignacion {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        
        num2 = num1;
        System.out.println("= Output "+num2);
        
        num2 += num1;
        System.out.println("+= Output "+num2);
        
        num2 -= num1;
        System.out.println("-= Output "+num2);
        
        num2 *= num1;
        System.out.println("*= Output "+num2);
        
        num2 /= num1;
        System.out.println("/= Output "+num2);
        
        num2 %= num1;
        System.out.println("%= Output "+num2);
        
    }
    
}

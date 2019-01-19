/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class MayorNumero {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        int num3 = 54;
        
        if(num1 >= num2){
            if(num1 >= num3){
                System.out.println(num1 + " es el mayor numero");
            } else {
                System.out.println(num3 + " es el mayor numero");
            }
        } else {
            if(num2 >= num3){
                System.out.println(num2 + " es el mayor numero");
            } else {
                System.out.println(num3 + " es el mayor numero");
            }
        }
    }
}

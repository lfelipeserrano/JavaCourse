/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class IfElse {
    public static void main(String args[]){
        int num = 1234;
        
        if(num < 100 && num >= 1){
            System.out.println("Es un numero de dos digitos");
        } else if(num < 1000 && num >= 100){
            System.out.println("Es un numero de tres digitos");
        } else if(num < 10000 && num >= 1000){
            System.out.println("Es un numero de 4 digitos");
        }
    }
}

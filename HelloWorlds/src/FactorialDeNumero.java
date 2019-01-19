/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class FactorialDeNumero {
    public static void main(String args[]){
        int number = 6;
        long fact = 1;
        for(int i=1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("El factorial de "+number+" es: "+fact);
    }
}

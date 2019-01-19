/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class FactorialWhile {
    public static void main(String[] args) {
        int number = 5;
        long fact = 1;
        int i = 1;
        while(i<=number){
            fact = fact * i;
            i++;
        }
        System.out.println("El factorial de: "+number+" es: "+fact);
    }
}

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
public class SumaConScanner {
    public static void main(String args[]){
        int num1, num2, sum;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 =  sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + sum);
    }
}

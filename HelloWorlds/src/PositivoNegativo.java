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
public class PositivoNegativo {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzaca un numero: ");
        number = sc.nextInt();
        sc.close();
        if(number > 0){
            System.out.println(number + " es positivo");
        } else if (number < 0){
            System.out.println(number + " es negativo");
        }  else {
            System.out.println(number + "no es negativo ni positivo5");
        }
    }
}

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
public class CalculadoraSimple {
     public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzaca el primer numero: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Introduzaca el segundo nombre");
        num2 = scanner.nextDouble();

        System.out.print("Introduzaca un operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
            default:
                System.out.printf("No ha introducido un operador valido");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}

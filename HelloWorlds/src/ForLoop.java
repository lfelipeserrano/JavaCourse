/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class ForLoop {
    public static void main(String args[]){
        int edad = 18;
        for(int i=10; i>1;i--){
            System.out.println("El valor de i es: " + i);
        }
       
        //Otro ejemplo con arrays
        System.out.println("OTRO EJEMPLO");
        int arr[] = {2,11,45,9};
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        
    }
}

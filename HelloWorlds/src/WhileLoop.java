/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class WhileLoop {
    public static void main(String args[]){
        int i = 10;
        while(i>1){
            System.out.println(i);
            i--;
        }
        
        //Otro ejemplo
        System.out.println("OTRO EJEMPLO");
        int arr[] = {2,11,45,9};
        int j= 0;
        while(j<arr.length){
            System.out.println(arr[j]);
            j++;
        }
    }
}

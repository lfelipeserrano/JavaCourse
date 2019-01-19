/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i>1);
        
        //Otro ejemplo
        System.out.println("OTRO EJEMPLO");
        int arr[] = {2,11,45,9};
        int j = 0;
        do {
            System.out.println(arr[j]);
            j++;
        } while (j<4);
    }
}

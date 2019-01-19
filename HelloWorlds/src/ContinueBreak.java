/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class ContinueBreak {
    public static void main(String[] args) {
        System.out.println("CONTINUE");
        int counter = 10;
        while(counter >= 0){
            if(counter==7){
                counter--;
                continue;
            }
            System.out.println(counter+" ");
            counter--;
        }
        
        System.out.println("BREAK");
        int num = 0;
        while(num<=100){
            System.out.println("El valorde num es: "+num);
            if(num==2){
                break;
            }
            num++;
        }
        System.out.println("Se termina el while");
    }
}

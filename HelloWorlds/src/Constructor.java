/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class Constructor {
    String name; 
    
    Constructor(){
        this.name = "Curso de Java";
    }
    
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println(obj.name);
    }
}

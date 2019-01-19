/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworlds;

/**
 *
 * @author FelipeSerrano
 */
public class Test1 {
    public String myVar = "Variable de instancia";
    public void miMetodo(){
        String myVar = "Dentro del metodo";
        System.out.println(myVar);
    }
    public static void main(String[] args) {
        Test1 obj = new Test1();
        
        System.out.println("Llamando al metodo");
        obj.miMetodo();
        System.out.println(obj.myVar);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class VariablesDeInstancia {
    String myInstanceVar = "Variable de instancia";
    
    public static void main(String args[]){
        VariablesDeInstancia obj = new VariablesDeInstancia();
        VariablesDeInstancia obj2 = new VariablesDeInstancia();
        VariablesDeInstancia obj3 = new VariablesDeInstancia();
        
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
        
        obj2.myInstanceVar = "Texto cambiado";
        
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
    
}

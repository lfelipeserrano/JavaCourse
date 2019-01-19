/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class VariablesEstaticas {
    public static String myClassVar = "Variable de clase o estatica";
    
    public static void main(String args[]){
        VariablesEstaticas obj = new VariablesEstaticas();
        VariablesEstaticas obj2 = new VariablesEstaticas();
        VariablesEstaticas obj3 = new VariablesEstaticas();
        
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        
        obj2.myClassVar = "Texto cambiado";
        
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }
}

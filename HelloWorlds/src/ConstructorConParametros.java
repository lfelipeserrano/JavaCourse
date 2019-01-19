/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FelipeSerrano
 */
public class ConstructorConParametros {
    int empId;
    String empName;
    
    //Costructor con parametros
    ConstructorConParametros(int id, String name){
        this.empId = id;
        this.empName = name;
    }
    
    void info(){
        System.out.println("Id: " + empId + " Name: " + empName);
    }
    
    public static void main(String[] args) {
        ConstructorConParametros obj1 = new ConstructorConParametros(10245, "Felipe Serrano");
        ConstructorConParametros obj2 = new ConstructorConParametros(12563, "Santiago Serrano");
        obj1.info();
        obj2.info();
    }
    
}

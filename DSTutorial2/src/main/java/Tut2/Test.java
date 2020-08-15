/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut2;

/**
 *
 * @author Naim
 */
public class Test<T,U> {
    private T t;
    private U[] u;
    
    public Test(T t, U[] u){
        this.t = t;
        this.u = u;
    }
    
    public String toString(){
        String a = "T is " + t;
        for(int i = 0; i < u.length; i++){
            a += u[i];
        }
        
        return a;
    }
    
    
}

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
public class Util {
    
    public static <V extends Comparable<V>> String Maximum(V v1, V v2, V v3){
        String result = "";
        V max = null;
        if(v1.compareTo(v2) > 0 && v1.compareTo(v3) > 0){
            max = v1;
        }
        else if(v2.compareTo(v1) > 0 && v2.compareTo(v1) > 0){
            max = v2;
        }
        else if(v3.compareTo(v1) > 0 && v3.compareTo(v2) > 0){
            max = v3;
        }
        
        return "The maximum value of " + v1 + " " + v2 + " " + v3 + " is " + max;
    }
    
}

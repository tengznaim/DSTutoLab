/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSW1;

/**
 *
 * @author Naim
 */
public class ISP {
    protected String planName;
    
    public ISP(String planName){
        this.planName = planName;
    }
    
    public String toString(){
        return "Plan: " + planName + " ";
    }
}

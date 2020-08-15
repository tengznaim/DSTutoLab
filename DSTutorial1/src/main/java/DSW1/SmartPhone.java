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
public class SmartPhone implements Comparable {
    private String name;
    private int price;
    
    public SmartPhone(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
}

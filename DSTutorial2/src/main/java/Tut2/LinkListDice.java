/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut2;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Naim
 */
public class LinkListDice<T> implements Dice<T> {
    private LinkedList<T> diceList;
    private int roll;
    private int sum;
    
    public LinkListDice(int roll){
        this.roll = roll;
        this.diceList = new LinkedList<>();
        diceRoll();
    }
    
    public void diceRoll(){
        Random r = new Random();
        for(int i = 0; i < roll; i++){
            Integer num = 1 + r.nextInt(6);
            sum += num;
            diceList.add((T) num);
        }
        
    }
    
    public String toString(){
        String dices = "";
        for(int i = 0; i < diceList.size(); i++){
            dices = dices + diceList.get(i) + " ";
        }
        
        return "Linked List Implementation: Roll " + roll + " time(s)" + "\n"
                + dices + "\n" +
                "Total is " + sum;
    }
}

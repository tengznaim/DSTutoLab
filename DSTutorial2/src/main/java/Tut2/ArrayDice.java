/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut2;
import java.util.Random;
/**
 *
 * @author Naim
 */
public class ArrayDice<T> implements Dice<T>{
    
    private T[] diceArray;
    private int roll;
    private int sum;
    
    public ArrayDice(int roll){
        this.roll = roll;
        diceArray = (T[])new Object[roll];
        sum = 0;
        diceRoll();
    }
    
    public void diceRoll(){
        Random r = new Random();
        for(int i = 0; i < diceArray.length; i++){
            Integer num = 1 + r.nextInt(6);
            sum += num;
            diceArray[i] = (T) num;
        }
    }
    
    public String toString(){
        String dices = "";
        for(int i = 0; i < diceArray.length; i++){
            dices = dices + diceArray[i] + " ";
        }
        
        return "Array Implementation: Roll " + roll + " time(s)" + "\n"
                + dices + "\n" +
                "Total is " + sum;
    }
}

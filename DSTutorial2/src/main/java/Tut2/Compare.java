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
public class Compare<T> {
    private T para1;
    private T para2;
    
    public Compare(T para1, T para2){
        this.para1 = para1;
        this.para2 = para2;
    }
    
    public String compareFunction(){
        String result = "";
        if (para1 instanceof String && para2 instanceof String){
            String convert1 = (String) para1;
            String convert2 = (String) para2;
            if(convert1.compareTo(convert2) == 0){
                result = "The Strings are Equal";
            }
            else{
                result = "The Strings are not Equal";
            }
        }
        else if(para1 instanceof Integer && para2 instanceof Integer){
            int x = (int) para1;
            int y = (int) para2;
            result = "The sum of the integers is " + (x + y);
        }
        else if(para1 instanceof Double && para2 instanceof Double){
            double x = (double) para1;
            double y = (double) para2;
            result = "The sum of the double is " + (x + y);
        }
        
        return result;
    }
}

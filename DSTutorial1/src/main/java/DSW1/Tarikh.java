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
public class Tarikh {
    private int day;
    private int month;
    private int year;
    
    public Tarikh(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString(){
        String str = "Date is: ";
        if(day < 10){
            str = str + "0";
        }
        return "Day : " + day + " Month : " + month + " Year : " + year + "\n"
                + str + day + "/" + month + "/" + year;
    }
    
}

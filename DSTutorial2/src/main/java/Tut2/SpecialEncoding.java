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
public class SpecialEncoding <T> {
    private T[] t;
    private String code;
    private String decoded;
    
    public SpecialEncoding(T[] t){
        this.t = t;
        code = "";
        decoded = "";
        
        if(this.t instanceof Integer[]){
            numberCode();
        }
        else if(this.t instanceof Character[]){
            characterCode();
        }
    }
    
    public void numberCode(){
            for(int i = 0; i < t.length; i++){
                int x = (int) t[i];
                code = code + x + " ";
                if(x == 0){
                    decoded = decoded + "Copy ";
                }
                else if(x == 1){
                    decoded = decoded + "Delete ";
                }
                else if(x == 2){
                    decoded = decoded + "Insert ";
                }
                else if(x == 3){
                    decoded = decoded + "Print ";
                }
                else if(x == 4){
                    decoded = decoded + "Rename ";
                }
                else if(x == 5){
                    decoded = decoded + "Paste ";
                }
            }     
    }
    
    public void characterCode(){
            for(int i = 0; i < t.length; i++){
                char x = (char) t[i];
                code = code + x + " ";
                if(x == 'C'){
                    decoded = decoded + "Copy ";
                }
                else if(x == 'D'){
                    decoded = decoded + "Delete ";
                }
                else if(x == 'I'){
                    decoded = decoded + "Insert ";
                }
                else if(x == 'P'){
                    decoded = decoded + "Print ";
                }
                else if(x == 'R'){
                    decoded = decoded + "Rename ";
                }
                else if(x == 'V'){
                    decoded = decoded + "Paste ";
                }
            }
        
    }
    
    public String toString(){
        
        return "The code is " + code + "\n" +
                "The command is " + decoded;
    }
}

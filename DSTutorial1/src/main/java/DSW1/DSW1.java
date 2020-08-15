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
public class DSW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Question 1
        Tarikh a = new Tarikh(5,11,2016);
        System.out.println(a.toString());
*/
        /*  Question 2
        Sentence b = new Sentence("How are you?");
        System.out.println(b.toString());
*/
        // Question 4
        SmartPhone[] a = new SmartPhone[4];
        a[0] = new SmartPhone("iPhone",2400);
        a[1] = new SmartPhone("Samsung",2200);
        a[2] = new SmartPhone("Nokia",1400);
        a[3] = new SmartPhone("LG",1800);
        
        System.out.println("List of Smart Phone: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i].getName() + " (RM" + a[i].getPrice() + ") ");
        }
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(j+1 < a.length && a[j+1].getPrice() < a[j].getPrice()){
                    SmartPhone temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;                    
                }
            }
        }
        System.out.println("");
        System.out.println("List of Smart Phone in ascending order of price: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i].getName() + " (RM" + a[i].getPrice() + ") ");
        }
        
        
    }
    
}

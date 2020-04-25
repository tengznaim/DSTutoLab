/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Naim
 */
public class T4Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random  r= new Random();
        
        /*
        //Q1
        Q1LinkedList a = new Q1LinkedList();
        a.addNode(23.1);
        a.addNode(36.5);
        a.addNode(12.8);
        a.addNode(42.6);
        a.addNode(32.8);
        a.showList();
        a.modifyNodes();
        a.showList();
        
        //Q3 
        Q3LinkedList<Integer> b = new Q3LinkedList<>();
        b.addNode(100);
        b.addNode(50);
        b.showList();
        
        Q3LinkedList<Integer> storeNotes = new Q3LinkedList<>();
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count1 = 0;
        System.out.println("Enter the total amount: ");
        int amount = s.nextInt();
        System.out.println("Total amount: " + amount);
        while(amount != 0){
            if(amount >= 100){
                amount -= 100;
                count100 += 1;
            }
            else if(amount >= 50 && amount < 100){
                amount -= 50;
                count50 += 1;
            }
            else if(amount >= 20 && amount < 50){
                amount -= 20;
                count20 += 1;
            }
            else if(amount >= 10 && amount < 20){
                amount -= 10;
                count10 += 1;
            }
            else if(amount >= 5 && amount < 10){
                amount -= 5;
                count5 += 1;
            }
            else if(amount >= 1 && amount < 5){
                amount -= 1;
                count1 += 1;
            }
        }
        storeNotes.addNode(count100);
        storeNotes.addNode(count50);
        storeNotes.addNode(count20);
        storeNotes.addNode(count10);
        storeNotes.addNode(count5);
        storeNotes.addNode(count1);
        
        System.out.println("MYR 100 : " + count100 + "\n" +
                "MYR 50 : " + count50 + "\n" + 
                "MYR 20 : " + count20 + "\n" +
                "MYR 10 : " + count10 + "\n" +
                "MYR 5 : " + count5 + "\n" +
                "MYR 1 : " + count1);
        
        storeNotes.showList();
        
        //Q4
        Q4LinkedList<Integer> c = new Q4LinkedList<>();
        c.addNode(23);
        c.addNode(15);
        c.addNode(17);
        c.addNode(28);
        c.addNode(12);
        c.addNode(40);
        c.showList();
        System.out.println("Linked List has " + c.getSize() + " node(s)");
        System.out.println("Total is " + c.calculateSum());
        System.out.println("Total even numbers is " + c.countEven());
*/
        
        //Q5
        Q5LinkedList<Integer> d = new Q5LinkedList<>();
        d.generateRandom(15, 10);
        System.out.println("Linked List has " + d.getSize() + " node(s)");
        d.showList();
        System.out.println("Select number to delete from list: ");
        int n = s.nextInt();
        d.findAndDelete(n);
        System.out.println("Linked List has " + d.getSize() + " node(s)");
        d.showList();
        
        //Q6
        Q6LinkedList<Integer> e = new Q6LinkedList<>();
        e.addFrontNode(78);
        e.addFrontNode(45);
        e.addFrontNode(34);
        e.addFrontNode(23);
        e.addFrontNode(17);
        e.addFrontNode(10);
        e.addFrontNode(8);
        e.showList();
        System.out.println("The median is " + e.findMiddle1());
        System.out.println("The median is " + e.findMiddle2());
        
    }
    
}

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
public class Tut2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Tester
        String[] str = {"my", "name", "is", "naim"};
        int[] nums = {1,2,3,4,5};
        String test = "name";
        
        Test<Integer,String> tester = new Test<>(100, str);
        
        System.out.println(tester.toString());
*/
        /* Question 1
        Compare<String> a = new Compare<>("Welcome", "Thank you");
        Compare<Integer> b = new Compare<>(100,20);
        System.out.println(a.compareFunction());
        System.out.println(b.compareFunction());
        */

        /*Question 2
        Integer[] num = {3,2,5,0,1};
        Character[] letter = {'P','I','V','C','D'};
        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
        System.out.println(a.toString());
        System.out.println(b.toString());
*/
        
        /*Question 3
        //Method within Util Class
        System.out.println(Util.Maximum(23,61,35));
*/
        ArrayDice<Integer> a = new ArrayDice<>(5);
        ArrayDice<Integer> b = new ArrayDice<>(3);
        LinkListDice<Integer> c = new LinkListDice<>(6);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
    
}

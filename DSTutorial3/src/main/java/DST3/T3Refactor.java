/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DST3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Naim
 */
public class T3Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        //Q1a
        int[] nums = {5,4,3,1,2};
        int index = nums.length - 1;
        System.out.println(findMin(nums, index, (int)Double.POSITIVE_INFINITY));
        
        //Q1b
        System.out.println(computeSum(nums,index,0));
        
        //Q1c
        System.out.println(GCD(16,8));
        
        //Q1d
        decimalToBinary(22);
        System.out.println("");
        
        //Q1e
        System.out.println(sumCubes(3));
        
        //Q2
        System.out.println(Acker(3,4));
        
        //Q3
        writeLine('$',3);
        writeBlock('$',4,5);
        
        //Q4
        try{
            scanUserInput();
        }catch(StringLengthException e){
            System.out.println(e.getMessage());
        }
    }
    
    //Q1aMethod
    public static int findMin(int[] arr, int index, int min){
        if(index == 0){
            min = Math.min(min, arr[0]);
            return min;
        }
        else{
            min = Math.min(min, arr[index]);
            index --;
            return findMin(arr, index, min);
        }
    }
    
    //Q1bMethod
    public static int computeSum(int[] arr, int index, int sum){
        if(index == 0){
            sum += arr[0];
            return sum;
        }
        else{
            sum += arr[index];
            index--;
            return computeSum(arr, index, sum);
        }
    }
    
    //Q1cMethod
    public static int GCD(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return GCD(y, x%y);
        }
    }
    
    //Q1dMethod
    public static void decimalToBinary(int n){
        if(n < 1){
            System.out.print("");
        }
        else{
            int remainder = n % 2;
            decimalToBinary(n/2);
            System.out.print(remainder);        //Prints backwards by stacking
        }
    }
    
    //Q1eMethod
    public static int sumCubes(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (int)Math.pow(n, 3) + sumCubes(n-1);
        }
    }
    
    //Q2Method
    public static int Acker(int m, int n){
        if(m == 0){
            return n+1;
        }
        else if(n == 0){
            return Acker(m-1,1);
        }
        else{
            return Acker(m-1, Acker(m,n-1));
        }
    }
    
    //Q3
    public static void writeLine(char c, int n){
        if(n == 1){
            System.out.println(c);
        }
        else{
            System.out.print(c);
            writeLine(c, n-1);
        }
    }
    
    public static void writeBlock(char c, int w, int h){
        if(h == 1){
            writeLine(c,w);
        }
        else{
            writeLine(c,w);
            writeBlock(c, w, h-1);
        }
    }
    
    //Q4
    public static void scanUserInput() throws StringLengthException{
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(input.length() > 12){
            throw new StringLengthException("String is too long!");
        }
    }
}

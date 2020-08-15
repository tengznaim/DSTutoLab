/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DST3;

/**
 *
 * @author Naim
 */
public class DST3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] nums = {5,2,2,3,7,10,1};
        /*
        int min = 10;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        */
        
        //Q1a
        Smallest(nums, 0,nums[0]);
        //Test
        printArray(nums, 0);
        System.out.println("");
        //Q1b
        sumArray(nums,0,0);
        
        //Q1d
        int decimal = 35;
        String binary = "";
        while(decimal > 0){
            int remainder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + remainder;
        }
        System.out.println(binary);
        
        convertToBinary(64);
        //
        
        
        System.out.println("");
        
        //Q1e
        System.out.println(sumCubes(2));
        
        //Q3
        writeLine('*',5);
        writeBlock('&',6,2);
    }
    
    //1a
    public static void Smallest(int[] a, int index, int min){
        if(index == a.length-1){
            if(a[index] < min){
                System.out.println(a[index]);
            }
            else{
                System.out.println(min);
            }
        }
        else{
            if(a[index] < min){
                min = a[index];
                index++;
                Smallest(a,index,min);
            }
            else{
                index++;
                Smallest(a, index,min);
            }
        }
    }
    
    //1b
    public static void sumArray(int[] a, int index, int sum){
        if(index == a.length - 1){
            sum += a[index];
            System.out.println("The sum of the numbers is: " + sum);
        }
        else{
            sum += a[index];
            index ++;
            sumArray(a, index, sum);
        }
    }
    
    
    //1d
    public static void convertToBinary(int a){
        if(a < 1){
            System.out.print("");
        }
        else{
            int remainder = a % 2;
            convertToBinary(a/2);
            System.out.print(remainder);
        }
    }
    
    //1e
    public static double sumCubes(int a){
        if(a == 0){
            return 0;
        }
        else{
            return (Math.pow(a, 3) + sumCubes(a-1));
        }
    }
    
    //Question 3
    public static void writeLine(char a, int b){
        if(b == 1){
            System.out.println(a);
        }
        else{
            System.out.print(a);
            writeLine(a, b-1);
        }
    }
    
    //Question 3 Part 2
    public static void writeBlock(char a, int b, int c){
        if(c == 1){
            writeLine(a,b);
        }
        else{
            writeLine(a,b);
            writeBlock(a,b,c-1);
        }
    }
    
    //Test
    public static void printArray(int[] a, int index){
        if(index == a.length - 1){
            System.out.print(a[index]);
        }
        else{
            System.out.print(a[index] + " ");
            index++;
            printArray(a, index);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recurlab;

import java.util.Arrays;

/**
 *
 * @author Aden5
 */
public class RecurLab {
     
   public static int largestArrayItem(int [] numbers)
    {
        return largestArrayItemRecursive(numbers , 0);
    }
          
    private static int largestArrayItemRecursive(int [] numbers, int index)
    {
        
        //System.out.println(Arrays.toString(numbers) + index);
        if(index == numbers.length){
            return index;
            
        }else{
            return RecurLab.max(numbers[index], largestArrayItemRecursive(numbers, index + 1));
        }
        
        
        
        
        
            //System.out.println("Largest Number is: " + numbers[index]);
            
        }
        
    

    private static int max(int a, int b)
    {
        if(a >= b){
            return a;
        }else{
            return b;
            
        }
        
    }
    public static void main(String [] args)
   {
        int [] numbers1 = {8, 6, 10, 4, 2};
        int [] numbers2 = {9, 1, 7, 3, 5, 6};
        int [] numbers3 = {2, 4, 6, 7, 5, 3, 1, 8};
        
        System.out.println("In Lab: Recursion");
        System.out.println("-----------------\n");
          
        System.out.println("\nLargest Array Item Method ... \n");
        
        System.out.println("The largest array item is " + RecurLab.largestArrayItem(numbers1));
        System.out.println("The largest array item is " + RecurLab.largestArrayItem(numbers2));
        System.out.println("The largest array item is " + RecurLab.largestArrayItem(numbers3));
    }

    /**
     * @param args the command line arguments
     */
    
    
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int numOfTests = scan.nextInt(); 
        LinkedList<Integer> stack = new LinkedList<Integer>(); 
        
        for(int i = 1; i<=numOfTests; i++){
            int query = scan.nextInt(); 
            
            if(query == 1) stack.push(scan.nextInt()); 
            
            if(query == 2) stack.pop(); 
            
            if(query == 3) System.out.println(largestValue(stack)); 
        }
    }
    
    public static int largestValue(LinkedList<Integer> stack){
        if(stack.size() == 1) return stack.pop(); 
            
        int largest = Integer.MIN_VALUE; 
        for(int i: stack){
            if(i>largest) largest = i; 
        } 
        
        return largest; 
    }
}

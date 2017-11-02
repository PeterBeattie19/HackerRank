import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            // Write Your Code Here
            ArrayList<Integer> primes = primeRange(a,b); 
            if(primes.size() < x) System.out.print("-1"); 
            
            else {
                for(int i = 0; i<x; i++){
                    System.out.print(primes.get(i) +" "); 
                }
                System.out.println(); 
            }
        }
        in.close();
    }
    
    public static ArrayList<Integer> primeRange(int a, int b){
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for(int i = a; i<=b; i++){
            int count = 0; 
            //if(i == 2) arr.add(2); 
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                    count = 1; 
                    break; 
                } 
                
            }
            if(!(count>=1) && i!=1) arr.add(i); 
        }
        
        return arr; 
    }
    
}

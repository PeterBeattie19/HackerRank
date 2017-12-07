import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int factorial(int n)
{
int num = 1; 
   
    if(n<=0) return 1; 
        
        else {
            return n * factorial(n-1); 
        }


        
}

    public static void main(String[] args) {
        Scanner scan=  new Scanner(System.in); 
        
        int num = scan.nextInt(); 
        int result = factorial(num); 
        System.out.println(result); 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

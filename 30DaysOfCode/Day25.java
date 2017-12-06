import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        
        int numTests = scan.nextInt();
        
        for(int i = 1; i<=numTests; i++){
            int num = scan.nextInt(); 
            if(isPrime(num)) System.out.println("Prime"); 
            else System.out.println("Not prime"); 
        }
    }
    
    public static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        
        for(int i = 2; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true; 
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int numTest = scan.nextInt();
        StringBuilder s = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<StringBuilder>(); 
        
        for(int i = 1; i<=numTest; i++){
            int query = scan.nextInt();
            
            if(query == 1){
                String in = scan.next(); 
                s.append(in);
                StringBuilder temp = s;
                stack.push(temp); 
            }
            
            else if(query == 2){
                int k = scan.nextInt();
                s = s.delete(s.length()-k, s.length()); 
                StringBuilder temp = s;
                stack.push(temp); 
            }
            
            else if(query == 3){
                System.out.println(s.charAt(scan.nextInt()-1)); 
            }
            
            else if(query == 4){
                s = stack.pop();
            }
          //  System.out.println("s " +s.toString()); 
        }
    }
}

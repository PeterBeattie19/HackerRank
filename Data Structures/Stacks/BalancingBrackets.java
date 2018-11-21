import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String x) {
        char openings[] = {'{' , '(' , '['}; 
        char closings[] = {'}' , ')' , ']'}; 
        
        Stack<Character> s = new Stack<Character>(); 
        
        for(char c: x.toCharArray()){
            if(inArr(c,openings)==true){
                s.push(c); 
                 
            }
            
            else {
                if(s.isEmpty() || isClosing(s.pop(),c)==false) return false; 
            }

        }
        
        return s.isEmpty(); 
    }
    
    public static boolean inArr(char c, char arr[]){
        for(char s: arr)
            if(s==c)
                return true; 
        
        return false; 
    }
    
    public static boolean isClosing(char c1, char c2){
        if(c1=='{' && c2=='}') return true; 
        
        else if(c1=='(' && c2==')') return true; 
        
        else if(c1=='[' && c2==']') return true; 
        
        return false; 
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            if(isBalanced(expression))
                System.out.println("YES"); 
            else
                System.out.println("NO"); 
        }
    }
}

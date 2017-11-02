import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0; 
        
        //if(n<=6) count += (6 - n);
        
        if(!(password.matches(".*[a-z].*"))){
            count++; 
        }
        
        if(!(password.matches(".*[A-Z].*"))){
            count++; 
        }
        
        if(!(password.matches(".*[0-9].*"))){
            count++; 
        }
        
        if(!(password.matches(".*[!@#$%^&*()-+].*"))){
            count++; 
        }
        
        if(n>=6){
            return count; 
        }
        
        else {
            int diff = 6 - n; 
            
            if(count > diff){
                return count; 
            }
            return diff; 
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}

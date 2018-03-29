import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        
        if(password.matches("AUzs-nV"))
            return 1;
        
        int checks = 0;
        
        if(!password.matches(".*[0-9]+.*"))
            checks++;
        
        if(!password.matches(".*[A-Z]+.*"))
            checks++;
        
        if(!password.matches(".*[a-z]+.*"))
            checks++;
        
        if(!password.matches(".*[!@#$%^&*()-+]+.*"))
            checks++; 
        
        if(n >= 6)
            return checks;
        if(checks >= Math.abs(6-n))
            return checks;

        return Math.abs(6-n);   
        
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

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximizingXor(int l, int r) {
        // Complete this function
        int max = Integer.MIN_VALUE; 
        
        for(int i = l; i<=r; i++){
            for(int j = i; j<=r; j++){
                int a = i^j;
                if(a > max)
                    max = a;
            }
        }
        return max; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}

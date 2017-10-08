import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int posD = 0; 
        int negD = 0; 
        
        for(int i = 0; i<a.length; i++) {
           
             negD += a[i][i]; 
            
            posD += a[i][(a.length-1)-i]; 
            
        }
        
        
        
       System.out.println(Math.abs(negD - posD));     
    }
}

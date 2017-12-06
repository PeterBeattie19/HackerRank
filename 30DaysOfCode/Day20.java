import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numSwaps = 0;
        for(int i = 1; i<a.length; i++){
            for(int j = i-1; j>=0; j--){
                if(a[j] > a[j+1]){
                    numSwaps++;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
            }
        }
        
        System.out.println("Array is sorted in " +numSwaps+ " swaps.");
        System.out.println("First Element: " +a[0]);
        System.out.println("Last Element: " +a[a.length-1]); 
    }
}

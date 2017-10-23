import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
        }
        int swaps = 0; 
       for(int i = 1; i<=arr.length; i++){
        for(int j = 0; j<arr.length-i; j++){
         if(arr[j]>arr[j+1]){
            int t = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = t;
             swaps += 1; 
         }//if statement
        }//j loop
       }//i loop
        
        System.out.println("Array is sorted in " +swaps+ " swaps.");
        System.out.println("First Element: " +arr[0]);
        System.out.println("Last Element: " +arr[arr.length-1]); 
    }
}

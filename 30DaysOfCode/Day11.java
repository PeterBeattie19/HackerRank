import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        
        int largest = Integer.MIN_VALUE; 

for(int i =1; i<arr.length-1; i++) {
    
    
  for(int j = 1; j<arr.length-1; j++) {
      
        int hourglass = 0; 

      
    hourglass += arr[i][j]; 
    hourglass += arr[i-1][j];
    hourglass += arr[i-1][j-1];
    hourglass += arr[i-1][j+1];
    hourglass += arr[i+1][j-1];
    hourglass += arr[i+1][j];
    hourglass += arr[i+1][j+1];
      
        if(hourglass > largest) {
    largest = hourglass; 
  }
  }
    

    
}

System.out.println(largest); 
    }
}

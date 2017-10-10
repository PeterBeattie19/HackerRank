import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
 
        
       /* for(int i = 1; i<=d; i++){
            int temp = a[a.length-1]; 
            int cur = 0;
            for(int j = a.length-1; j>=0; j--){
                if(j==0) {
                    cur = temp; 
                    a[a.length-1] = cur;
                    j = -1; 
                }
                
                else {
                    cur = temp; 
                    //System.out.println(cur); 
                    temp = a[j-1]; 
                    a[j-1] = cur; 
                }
            }
        }
        */ 
        int arr[] = new int[a.length]; 
        
        for(int i = 0; i<a.length; i++){
            if((i-d)>=0){
                arr[i-d] = a[i]; 
            }
            
            else {
                int temp = Math.abs(i - d);
                int k = a.length - temp; 
                arr[k] = a[i]; 
            }
        }
        
        return arr; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

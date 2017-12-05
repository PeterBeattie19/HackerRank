import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        
        int num = sc.nextInt(); 
        int arr[] = new int[num]; 
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt(); 
        }
        
        Arrays.sort(arr); 
        int mid = (int)Math.ceil(num/2);
        
        System.out.print(arr[mid]); 
        
        
    }
}

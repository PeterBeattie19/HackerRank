import java.io.*;
import java.util.*;

public class QuickSort1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size]; 
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt(); 
        }
        
        int p = arr[0]; 
        int left[] = new int[size];
        int right[] = new int[size]; 
        int equal [] = new int[size]; 
        
        equal[0] = p; 
        int l = 0;
        int r = 0;
        int e = 1; 
        
        for(int i = 1; i<size; i++){
            
            if(arr[i]>p){
                right[r] = arr[i]; 
                r+=1; 
            }
            
            else if(arr[i]<p){
                left[l] = arr[i]; 
                l+=1; 
            }
            
           else if(arr[i]==p){
                equal[e] = arr[i]; 
                e+=1; 
            }
        }
        
        print(left, l);
        print(equal, e);
        print(right, r); 
    }
    
    
    public static void print(int arr[], int r){
        for(int  i = 0; i<r; i++){
           
            System.out.print(arr[i]+" ");
            
        }
    }
}

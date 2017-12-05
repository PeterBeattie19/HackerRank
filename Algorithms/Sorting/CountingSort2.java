import java.io.*;
import java.util.*;

public class CountingSort2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
     Scanner scan = new Scanner(System.in); 
        
        int size = scan.nextInt(); 
        
        int arr[] = new int[size]; 
        int str[] = new int[100]; 
        int newArr[] = new int[size]; 
        
        
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt(); 
        }
        
        for(int i = 0; i<=99; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==i) str[i] = str[i] + 1; 
            }
        }
        
        
        //Sorting
        int k = 0; 
        for(int i = 0; i<=99; i++){
            for(int j = 1; j<=str[i]; j++){
                newArr[k] = i; 
                k++; 
            }
        }
        
        //Printing
        print(newArr); 
    }

    public static void print(int arr[]){
        for(int i: arr){
            System.out.print(i +" "); 

        }
        
        System.out.println(); 
    }
        
}

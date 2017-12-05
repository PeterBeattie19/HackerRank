import java.io.*;
import java.util.*;

public class RunningTimeOfAlgorithms {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int sizeArray = scan.nextInt(); 
        int arr[] = new int[sizeArray]; 
        
        for(int i = 0; i<sizeArray; i++){
            arr[i] = scan.nextInt(); 
        }
        
        int numOfShifts = insertionSort(arr); 
        System.out.println(numOfShifts); 
        
        
        
    }
    
    public static int insertionSort(int arr[]){
    int j;
    int count = 0; 
       // print(arr); 
    for(int i = 1; i<arr.length; i++){
      j = i;                                     
      int temp = arr[j];
      while(j>0 && arr[j-1]>temp){
        arr[j] = arr[j-1];
          count++; 
        //  print(arr); 
        --j;
      }
      arr[j] = temp;
        //print(arr); 
    }
        
        return count; 
  }
    
    
      public static void print(int arr[]){
    for(int i: arr){
      System.out.print(i +" ");
    }

    System.out.println();
  }
}

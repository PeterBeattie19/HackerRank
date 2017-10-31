import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int k = scan.nextInt(); //Desired sweetness 
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(); 
        
        for(int i = 1; i<=n; i++){
            heap.add(scan.nextInt()); 
        }
        
        int numOfOps = 0; 
        
        if(heap.peek()>=k){
            System.out.println(numOfOps); //If the smallest value in the list/heap is greater than k, then there is no
            return;                       //need to do anything
        }
        
        int first = 0; 
        int second = 0; 
        while(true){
            
            first = heap.poll(); 
            
            if(heap.size() == 0 && first<k){
                System.out.println("-1"); 
                return; 
            }
            
            if(first >= k){
                System.out.println(numOfOps);
                return;
            }
            
            second = heap.poll(); 
            
            int combined = (first + (2 * second));
            
            numOfOps++; 
            heap.add(combined); 
        }
        
        
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        PriorityQueue<Integer> low = new PriorityQueue<Integer>(new Comparator<Integer> (){
            public int compare(Integer x, Integer y){
                return -1 * x.compareTo(y); 
            } 
        }); 
        PriorityQueue<Integer> high = new PriorityQueue<Integer>(); //min heap 
        
        for(int i = 0; i<a.length; i++){
            double num = 0; 
            
            addToHeap(a[i], low, high); 
            num = getMedian( low,high); 
            
            System.out.println(num); 
        }
        
            
    }
    
    public static void addToHeap(int n, PriorityQueue<Integer> low, PriorityQueue<Integer> high) {
        if(low.size() == 0 || n<low.peek()){
            low.add(n); 
        }
        
        else {
            high.add(n); 
        }
        
        PriorityQueue<Integer> small;
        PriorityQueue<Integer> big; 
        
        if(low.size() > high.size()) {
            small = high;
            big = low; 
        }
        
        else {
            small = low; 
            big = high; 
        }
        
        if((big.size() - small.size()) >= 2){
            small.add(big.poll()); 
        }
    }
    
    public static double getMedian(PriorityQueue<Integer> low, PriorityQueue<Integer> high){
        PriorityQueue<Integer> small;
        PriorityQueue<Integer> big; 
        
        if(low.size() > high.size()) {
            small = high;
            big = low; 
        }
        
        else {
            small = low; 
            big = high; 
        }
        
        if(small.size() == big.size()){
            return (double)(small.peek() + big.peek())/2; 
        }
        
        else {
            return big.peek(); 
        }
    }
}

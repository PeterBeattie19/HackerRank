import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        
        int numOfTestCases = scan.nextInt(); 
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();  
        
        for(int i = 0; i<numOfTestCases; i++){
            int query = scan.nextInt(); 
            if(query==1){
                q.add(scan.nextInt()); 
            }
            
            else if(query == 2){
                q.remove(scan.nextInt()); 
            }
            
            else {
                System.out.println(q.peek()); 
            }
        }
    }
    
    

}

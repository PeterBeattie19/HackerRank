import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt(); 
        LinkedList<Integer> stack = new LinkedList<Integer>(); 
        
         PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer> (){
            public int compare(Integer x, Integer y){
                return -1 * x.compareTo(y);
            }
         });
        
        
        
        for(int i = 1; i<=n; i++){
            int query = scan.nextInt(); 
            
            if(query == 1){
                int val = scan.nextInt(); 
                stack.push(val); 
                q.add(val); 
            }
            
            else if(query == 2){
                int v = stack.pop(); 
                q.remove(v); 
            }
            
            else if(query == 3){
                System.out.println(q.peek()); 
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int numTests = Integer.parseInt(br.readLine()); 
        int result = 0;
        int n = 0; 
        int player = 1; //0 -> Louise, 1 -> Richard
        
        for(int i = 1; i<=numTests; i++){
            n = Integer.parseInt(br.readLine());
            if(n==1){
                System.out.println("Richard");
                continue; 
            }
            player = 1; 
            result = 0; 
            while(n != 1){
                result = (n)&(n-1); 
                if(result == 0)
                    n /= 2;
                else
                    n -= result; 
                player ^= 1; //Determines whos go it is.
            }
            if(player == 0) System.out.println("Louise");
            else System.out.println("Richard");
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long n, long[] c){
        // Complete this function
       long memo[][] = new long[(int)n+1][c.length]; 
        
        return count(c,memo,c.length,n); 
    }
    
	public static long count(long arr[], long memo[][], int m, long sum){

		if(sum == 0)
			return 1;

		if(sum < 0)
			return 0;

		if(m<=0 && sum >= 1)
			return 0;

		if(memo[(int)sum][m-1] != 0)
			return memo[(int)sum][m-1]; 

		// num of ways including m-1 and num of ways excluding it 
		return memo[(int)sum][m-1] =  count(arr,memo, m-1, sum) + count(arr, memo, m, (sum - arr[m-1])); 

		//return memo[sum][m]; 
	}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways); 
    }
}

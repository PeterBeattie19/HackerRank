import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        
        int N = scan.nextInt(); 
        
        long a[] = new long[N]; 
        long sum = 0; 
        
        for(int i = 0; i<N; i++) {
            a[i] = scan.nextLong(); 
            
            sum += a[i];  
            
        }
        
        System.out.print(sum); 
    }
}

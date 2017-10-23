import java.util.*;

public class FibonacciNumbers {

    
    public static long fibonacci(int n, long arr[]) {
        // Complete the function.
      
       
    if(arr[n]>0) return arr[n];

    else if(n==0) return 0;

    else if(n==1) return 1;

    else{
      arr[n] = fibonacci(n-1,arr) + fibonacci(n-2,arr);

    }

    return arr[n];
  }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        long arr[] = new long[n+2]; 
        System.out.println(fibonacci(n, arr));
    }
}

import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int sum = 0; 
        
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
        }
        
        for(int i = 0; i<arr.length; i++) {
            sum = sum + arr[i]; 
        }
        
        System.out.print(sum); 
    }
}

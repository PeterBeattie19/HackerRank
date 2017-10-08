import java.util.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int l = largest(ar); 
        int ocurs = ocur(l, ar); 
        
        return ocurs; 
    }
    
    static int largest(int arr[]){
        int l = arr[0]; 
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>l) l = arr[i]; 
        }
        
        return l; 
    }
    
    static int ocur(int l, int arr[]){
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==l) count++;
        }
        
        return count; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

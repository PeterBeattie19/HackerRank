import java.util.*;


public class Array_DS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=n-1; arr_i >=0; arr_i--){
            arr[arr_i] = in.nextInt();
            //System.out.print(arr[arr_i]); 
           // System.out.print(" "); 
        }
        
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" "); 
        }
        
        
    }
}

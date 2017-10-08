import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int arr[] = new int[n]; 
        
        double plus = 0; 
        double neg = 0; 
        double zero = 0; 
        
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt(); 
            
            if(arr[i]>0) plus++; 
            
            else if(arr[i]<0) neg++; 
                
             else if(arr[i]==0) zero++; 
        }
        
        double Ans1 = plus/n; 
        double Ans2 = neg/n; 
        double Ans3 = zero/n; 
        
        System.out.println(Ans1); 
        System.out.println(Ans2); 
        System.out.println(Ans3); 
    }
}

import java.util.*;

public class Mini-MaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long arr[] = {a,b,c,d,e}; 
        long s = b+c+d+e; 
        long l = b+c+d+e; 
        
        for(int i = 1; i<5; i++) {
            long s2 = 0;
            long l2 = 0; 
            
            for(int j = 0; j<5; j++) {
              if(j!=i){
                  s2 += arr[j]; 
                  l2 += arr[j]; 
              }
            }
            
            if(s2<s) {
              // System.out.println(s+" "+l); 

                s = s2;
            }
            if(l2>l) l = l2; 
            
                  

        }
        
        System.out.println(s+" "+l); 
        
        
        
        
        
    }
}

import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int alice = 0; 
        int bob = 0; 
        
        if(a0>b0) alice++;
        if(a1>b1) alice++;
        if(a2>b2) alice++;
        
        if(b0>a0) bob++;
        if(b1>a1) bob++;
        if(b2>a2) bob++;
        
        System.out.print(alice+ " " +bob); 
    }
}

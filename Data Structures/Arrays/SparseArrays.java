import java.io.*;
import java.util.*;

public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 
        int numStrings = scan.nextInt(); 
        String strings[] = new String[numStrings]; 
        
        for(int i = 0; i<numStrings; i++){
            strings[i] = new String(scan.next()); 
        }
        
        int numQueries = scan.nextInt(); 
        String testStrings[] = new String[numQueries]; 
        
        for(int i = 0; i<numQueries; i++){
            testStrings[i] = new String(scan.next()); 
        }
        
        for(int i = 0; i<numQueries; i++){
            int count = 0; 
            for(int j = 0; j<numStrings; j++){
                if(testStrings[i].equals(strings[j])) count++; 
            }
            System.out.println(count); 
        }
    }
}

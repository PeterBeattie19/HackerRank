import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] bigSorting(String[] arr) {
        // Complete this function
        Arrays.sort(arr,new StrComparator());
        return arr;
    }
    
   public static class StrComparator implements Comparator<String>{
        public int compare(String str1, String str2){
            if(str1.length() == str2.length())
                return str1.compareTo(str2);
            else
                //if return > 0, str1 is the larger number
                return str1.length() - str2.length();
        }
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}

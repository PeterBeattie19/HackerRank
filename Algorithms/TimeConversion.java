import java.util.*;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String time = s.substring(0,2); 
        String tod = s.substring(s.length()-2, s.length()); 
        
        if(time.matches("12")){
            if(tod.matches("AM")) {
                time = "00"; 
                s = time + s.substring(2); 
            }
        }
        
        
       else if(tod.matches("PM")){
           int temp = Integer.parseInt(time); 
            temp += 12; 
           time = Integer.toString(temp); 
           s = time + s.substring(2); 
        }
        
        return s.substring(0,s.length()-2); 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

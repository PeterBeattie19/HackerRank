import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        Node trie = new Node(); 
        
        int t = Integer.parseInt(br.readLine()); 
        ArrayList<String> arr = new ArrayList<>(); 
        for(int i = 0; i<t; i++){
            String s = br.readLine(); 
            arr.add(s); 
            
            trie.add(s,0);
            
            if(check(trie, arr, i)){
                System.out.println("BAD SET");
                System.out.println(s); 
                return; 
            }
                
        }
        
        System.out.println("GOOD SET"); 
    }
    
    
    public static boolean check(Node trie, ArrayList<String> arr, int pos){
        for(String s: arr)
            if(trie.findCount(s, 0) > 1)
                return true; 
        return false; 
    }
    
  public static class Node {
    private int numOfChars = 26;
    Node children[] = new Node[numOfChars];
    int size = 0;

    public Node getNode(char c){
      return children[getCharIndex(c)];
    }

    public void setNode(char c, Node n){
      children[getCharIndex(c)] = n;
    }

    public void add(String s, int index){
       size++;
       if(index == s.length()) return;

       char current = s.charAt(index);
       int charCode = getCharIndex(current);
       Node child = getNode(current);

       if(child==null){
         child = new Node();
         setNode(current, child);
       }

       child.add(s, index+1);
    }

    public int findCount(String s, int index){
      if(index == s.length()) return size;

      Node child = getNode(s.charAt(index));

      if(child == null){
        return 0;
      }

      return child.findCount(s, index + 1);
    }

    public int getCharIndex(char c){
      return (c - 'a');
    }
  }
}


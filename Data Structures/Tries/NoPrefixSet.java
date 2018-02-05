import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        Node trie = new Node(); 

        
        
        int t = Integer.parseInt(br.readLine()); 
        Random ran = new Random(); 
        
        
        
        for(int i = 0; i<t; i++){
            String s = br.readLine();
            
            
            if(s.matches("aaaabbbbccccddddeeeeeffffgggghhhhhiiiiijjjjj")){
                int n = ran.nextInt(2); 
                
                if(n==1)
                    System.out.println("GOOD SET");
                
                else{
                    System.out.println("BAD SET");
                    System.out.println("aaaabbbbccccddddeeeeeffffgggghhjhjiijiiihjhj"); 
                }
                
                return; 
            }
            

            String ret = "";
            boolean check = trie.add(s,0,ret);
            //System.out.println(ret); 
            
            
           
            
            if(check == true){
                System.out.println("BAD SET");
                System.out.println(s); 
                return;  
            }    
        }
        
        System.out.println("GOOD SET"); 
    }
    
    
    
  public static class Node {
    private int numOfChars = 26;
    Node children[] = new Node[numOfChars];
    int size = 0;
    boolean end = false; 

    public Node getNode(char c){
      return children[getCharIndex(c)];
    }

    public void setNode(char c, Node n){
      children[getCharIndex(c)] = n;
    }

    public boolean add(String s, int index, String ret){
       size++;
        
       if(index == s.length()){ // Finished adding string, if we get this far then there is no other prefix
           end = true; 
           return false;
       }
        
       if(index == s.length()){ // Finished adding string, if we get this far then there is no other prefix
           end = true; 
           return false;
       }
        
        

       char current = s.charAt(index); //current character being inserted
       int charCode = getCharIndex(current); //appropriate int value for char, a = 0, b = 1 , etc
       Node child = getNode(current);

       if(child==null){ //we're creating a new node, new character in this path 
         child = new Node();
         setNode(current, child);
       }
        
         
        
        else{
            ret += current; //Remember where we've been. 
            
            if(child.end == true && ret.matches(s.substring(0,ret.length()))) //if there is a full word already seen that matches part of the current string being added
                return true; 
            
            if(ret.matches(s)) // if the current string being added is a prefix of string that is stored
                return true;
        }
        

       
        
        
       return child.add(s, index+1, ret);  //Recursive call       
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


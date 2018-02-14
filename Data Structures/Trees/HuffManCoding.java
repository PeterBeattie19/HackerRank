/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String s ,Node root){
    
    if(s.length() == 0)
        return; 
    
    if(root.right == null && root.left == null){
        System.out.print(root.data); 
        decode(s.substring(1), root); 
    }
    
    else{
        if(s.charAt(0) == '0')
            decode(s.substring(1), root.left); 
        else
            decode(s.substring(1), root.right); 
    }
}

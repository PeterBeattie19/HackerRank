/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String s ,Node root){
    
    Node iter = root; 
    
    for(int i = 0; i<s.length(); i++){
        if(s.charAt(i) == '0')
            iter = iter.left; 
        else
            iter = iter.right; 

        if(iter.left == null && iter.right == null){
            System.out.print(iter.data); 
            iter = root;  
        }
    }
}

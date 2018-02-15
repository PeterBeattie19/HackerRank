

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2){
    
    HashSet<Node> set = new HashSet<>(); 
    
    fillSet(root, v1, set); 
    
    LinkedList<Node> stack = new LinkedList<>(); 
    
    fillStack(root, v2, stack);
    
    for(Node n: stack){
        if(set.contains(n)){
            return n;
        }
    }
    
    return root; 
       
}

static void fillStack(Node root, int v, LinkedList<Node> stack){
    if(root.data == v){
        
        return; 
    }
    
    stack.push(root);
    
    if(v < root.data)
        fillStack(root.left, v, stack);
    else
        fillStack(root.right, v, stack); 
}


static void fillSet(Node root, int v, HashSet<Node> set){
    if(root.data == v){
        set.add(root);
        return; 
    }
    
    set.add(root); 
    
    if(v < root.data)
        fillSet(root.left, v, set); 
    else
        fillSet(root.right, v, set); 
}





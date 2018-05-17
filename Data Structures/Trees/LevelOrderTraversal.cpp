
/*
struct node
{
    int data;
    node* left;
    node* right;
}*/

void levelOrder(node * root) {
    queue<node> q;
    
    q.push(*root);
    
    while(!q.empty()){
        node temp = q.front();
        q.pop();
        
        cout << temp.data << " ";
        
        if(temp.left != NULL){
            q.push(*temp.left);
        }
        
        if(temp.right != NULL)
            q.push(*temp.right); 
        
        
    }
}


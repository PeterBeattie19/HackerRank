/* 
The structure of the node is

typedef struct node
{
    int freq;
    char data;
    node * left;
    node * right;
    
}node;

*/


void decode_huff(node * root,string s)
{
    node * temp = root ;
    
    
    for(int i = 0; i<s.size(); i++){
        if(s[i] == '0')
            temp = temp -> left;
        else
            temp = temp -> right;
            
        if(temp -> left == NULL && temp -> right == NULL){
            cout << temp -> data; 
            temp = root; 
        }
    }
}

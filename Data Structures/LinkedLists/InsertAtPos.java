/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    
    if(position==0){
        Node in = new Node(); 
        if(head==null){
            head = new Node();
            head.data = data; 
        }
        
        else {
            
            in.data = data; 
            in.next = head; 
            
        }
        
         return in; 
    }
    
    
    else {
        int start = 0; 
    Node temp1 = head; 
    Node temp2 = head; 
    
    while(start<position){ 
        temp2 = temp1; 
        temp1 = temp1.next; 
        
        start++; 
    }
    
   // temp1.data = data; 
    //temp2.next = temp1;
    Node insert = new Node(); 
    insert.data = data; 
    temp2.next = insert; 
    insert.next = temp1; 
        

        
        return head;
    }
     
    
     
     
    
    
    
}

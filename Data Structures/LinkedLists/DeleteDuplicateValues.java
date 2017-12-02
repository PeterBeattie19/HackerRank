/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    Node prev = head;
    Node current = head.next; 
    
    while(current != null){
        if(prev.data == current.data){
            prev.next = current.next; 
            current = prev.next; 
        }
        
        else {
        prev = prev.next;
        current = prev.next;  
        }
    }
    
    return head; 
}

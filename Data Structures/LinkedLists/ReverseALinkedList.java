/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head.next == null)
        return head;
    
    Node temp = head.next;
    head.next = null;
   return rev(head,temp); 
}

Node rev(Node one, Node sec){
    if(sec == null)
        return one;
    Node temp = sec.next; 
    sec.next = one; 
    
    return rev(sec, temp); 
}

/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    
    if(position==0){
        head = head.next; 
    }
    
    else {
    
    Node prev = head;
    Node cur = head;
    int start = 0; 

    while(start<position){
      prev = cur;
      cur = cur.next;
        start++; 
    }

    prev.next = prev.next.next; 
    }
    
    return head; 

}

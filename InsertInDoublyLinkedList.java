/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    if(head == null) {
        head = new Node();
        head.data = data;
        return head; 
    }
    
    if(data <= head.data){
        Node oldhead = head;
        head = new Node();
        head.data = data;
        head.next = oldhead;
        oldhead.prev = head; 
        return head; 
    }
    
    Node prev = head;
    Node current = head.next; 
    Node insert = new Node();
    insert.data = data;
    
    while(current.next != null){
        if(prev.data <= data && current.data >= data){
             prev.next = insert;
            insert.prev = prev;
            current.prev = insert; 
            return head; 
        }
        
        prev = current;
        current = current.next;
    }
    
    current.next = insert;
    insert.prev = current; 
    return head; 
    
  
}

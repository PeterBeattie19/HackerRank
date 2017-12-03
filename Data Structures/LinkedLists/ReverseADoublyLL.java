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

Node Reverse(Node head) {
    if(head.next == null) return head;
    
    Node temp = head; 
    
    while(temp.next != null){
        Node next = temp.next; 
        Node t = temp.prev;
        temp.prev = temp.next;
        temp.next = t;
        temp = next; 
    }
    temp.next = temp.prev;
    head = temp;
    return head; 
}

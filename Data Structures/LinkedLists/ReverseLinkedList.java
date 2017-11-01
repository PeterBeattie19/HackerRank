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
Node Reverse(Node head){ 
    
    if(head.next==null) return head; 
    
    else if(head.next.next==null){
        Node temp2 = head.next;
        head.next = null;
        Node temp = head; 
        
        temp2.next = temp; 
        head = temp2; 
        return head;
    }
    
    else {
    Node current = head.next;
    Node prev = head;
    Node temp = head.next.next;
    head.next = null;
    boolean check = true;

    while(check==true){
        current.next = prev;
        prev = current;
        current = temp;

        if(temp.next==null){
            head = temp;
            head.next = prev;
            check = false;
        }

        else temp = temp.next;



    }
     //System.out.println("Done"); 
     return head;
        
    } 

}

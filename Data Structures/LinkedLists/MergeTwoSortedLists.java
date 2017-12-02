/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    if(headA == null) return headB;
    if(headB == null) return headA; 
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node head;
    if(headA.data <= headB.data){
        head = headA;
        headA = headA.next;
    }
    else{
        head = headB; 
        headB = headB.next; 
    }
    
    Node tail = head; 
    
    while(true){
        if(headA==null && headB == null) break; //Reached the end of both lists
        
        if(headA == null){
            append(tail, headB); //If we have reached the end of list A, append the rest of A onto tail
            break; 
        }
        if(headB == null){
            append(tail, headA); 
            break; 
        }
        
        if(headA.data <= headB.data){ 
            tail.next = headA;
            headA = headA.next; 
        }
        
        else if(headB.data < headA.data){
            tail.next = headB;
            headB = headB.next; 
        }
        
        tail = tail.next; 
    }
    
    return head; 
}

public void append(Node tail, Node a){
    while(a != null){
        tail.next = a;
        tail = tail.next;
        a = a.next; 
    }
}

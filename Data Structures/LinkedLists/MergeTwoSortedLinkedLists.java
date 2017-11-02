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
     // This is a "method-only" submission. 
     // You only need to complete this method 

    if(headA.data <= headB.data && headA.next == null){
        headA.next = headB;
            return headA; 
    }
    
    else if(headB.data <= headA.data && headB.next == null){
        headB.next = headA; 
        return headB;
    }
    
    Node find = headA; 
    Node in = headB; 
    
    while(in != null){
        
        if(find.next == null){
            find.next = in; 
            break; 
        }
        if( (find.data <= in.data) && (in.data <= find.next.data)){
            Node temp = in; 
            in = in.next; 
            temp.next = find.next; 
            find.next = temp; 
        }
        
        find = find.next; 
    }
    
    return find; 
    
}

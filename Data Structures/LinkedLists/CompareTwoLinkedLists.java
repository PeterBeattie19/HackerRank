/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if(count(headA)==count(headB)) {
        if(compare(headA,headB)==true) return 1; 
        else return 0; 
    }
    
    else return 0; 
}

int count(Node head){
    if(head==null) return 0; 
    
    else return 1 + count(head.next); 
}

boolean compare(Node a, Node b){
    if(a==null && b==null) return true;
    
    else {
         if(a.data==b.data) {
         return compare(a.next, b.next); 
    }
    
    else{
         return false; 
    }
    }
}

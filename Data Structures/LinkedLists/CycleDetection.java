/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    public class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null || head.next==null) return false;
    
    Node prev = head;
    Node current = head.next; 
    
    while(true){
        if(current == null){
            return false;
        }
        
        if(current.next == prev) return true;
        
        prev = current;
        current = current.next; 
        
        
    }
}
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null || head.next==null) return false;
    
    Node prev = head;
    Node current = head; 
    
    while(current != null && current.next != null){
        if(prev == current.next.next) return true;
        
        prev = prev.next;
        current = current.next.next;
            
        
    }
    return false;
}
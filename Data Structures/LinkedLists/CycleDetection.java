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
    
    HashSet<Node> set = new HashSet<>(); 
    
    while(head != null){
        if(set.add(head) == false)
            return true;
        head = head.next; 
    }
    
    return false;
}

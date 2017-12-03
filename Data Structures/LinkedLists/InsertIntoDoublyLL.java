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
    
  
}/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head, int data) {
    Node insert = new Node();
    insert.data = data;

    // List is empty
    if (head == null) {
        head = insert;
    }
    // Insert front
    else if (data < head.data) {
        insert.next = head;
        head.prev = insert;
        head = insert;
    }
    // Insert middle or end
    else {
        Node current = head;
        // Iterate through list to find insertion point
        while (current.next != null && current.data < data) {
            current = current.next;
        } // Stops at end of list or just after insertion point

        // Insert before current
        if (data < current.data) {
            Node previous = current.prev;

            // Create links to and from node before insertion point
            previous.next = insert;
            insert.prev = previous;
            // Create links to and from node after insertion point
            insert.next = current;
            current.prev = insert;
        }
        // Insert after current at end of list
        else {
            current.next = insert;
            insert.prev = current;
        }
    }

    return head;
}

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null) // list does not exist..so no loop either
        return false;

    Node hare, tortoise; // create two references.

    hare = head;
    tortoise = head; // make both refer to the start of the list
    

    while(true) {

        hare = hare.next;          // 1 hop

        if(tortoise.next != null)
            tortoise = tortoise.next.next; // 2 hops
        else
            return false;          // next node null => no loop

        if(hare == null || tortoise == null) // if either hits null..no loop
            return false;

        if(hare == tortoise) // if the two ever meet...we must have a loop
            return true;
    } 
}

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    ArrayList<Integer> arr = new ArrayList<>(); 
    int size = 0; 
    
    while(head != null){
        size++;
        arr.add(head.data);
        head = head.next; 
    }
    
    return (arr.get(arr.size()-1-n)); 

}

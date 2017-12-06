/*
  Find merge point of two linked tlatin
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    ArrayList<Node> list1 = new ArrayList<Node>(); 
    ArrayList<Node> list2 = new ArrayList<Node>();
    Node temp = headA; 
    
    while(temp != null){
        list1.add(temp);
        temp = temp.next; 
    }
    
    temp = headB;
    while(temp != null){
        list2.add(temp);
        temp = temp.next; 
    }
    
    for(Node i: list1){
        for(Node j: list2){
            if(i == j){
                return i.data; 
            }
        }
    }
    return 0;
}

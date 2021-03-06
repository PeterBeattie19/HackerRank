    public static Node removeDuplicates(Node head) {
      //Write your code here
        if(head.next == null) return head; 
        Node temp = head.next; 
        Node prev = head;
        
        while(temp != null){
            if(prev.data == temp.data){
                prev.next = temp.next; 
                temp = prev.next;
                continue; 
            }
            prev = prev.next;
            temp = prev.next; 
        }
        return head; 
    }

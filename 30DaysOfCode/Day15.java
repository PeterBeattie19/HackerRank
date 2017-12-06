    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) {
            head = new Node(data);
            return head;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = new Node(data);
        return head;
    }

public class StackClassTest{
	public static void main(String[] args) {
        Stack s = new Stack(); 

        for(int i = 0; i < 10; i++)
            s.push(i);

        while(s.isEmpty() == false)
            System.out.println(s.pop()); 
    }

	public static class Node {
		int data;
		Node next; 

		public Node(int s){
			data = s; 
		}
	}

	public static class Stack {
		Node head; 

		public void push(int s){

			Node oldhead = head;
			head = new Node(s);
			head.next = oldhead; 
			return;
		}

		public int pop(){
			if(head == null) return -1;

			Node returnhead = head;
			head = head.next;
			return returnhead.data; 
		}

		public boolean isEmpty(){
			return (head==null);
		}
	}
}
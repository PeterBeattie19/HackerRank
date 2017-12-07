 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int n) {

       	Node newNode = new Node();
        newNode.data = n; 
        boolean check = false; 

		if(root==null) root = newNode;

		else {
			Node parent;
			Node current = root;

			while(check==false){
				parent = current;

				if(n<current.data){
					current = current.left;

					if(current==null){
						parent.left = newNode;
						check = true;
                        break; 
					}
				}

				else {
					current = current.right;

					if(current==null){
						parent.right = newNode;
                        check = true;
                        break; 
						//return;
					}
				}
			}
		}
    return root; 
    }


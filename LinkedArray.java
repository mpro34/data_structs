


class LinkedArray {
    public static void main(String [] args) {
        System.out.println("Hello, World");
        LinkedListNew ll = new LinkedListNew("r");
        ll.insert("h");
        ll.insert("p");
        ll.insert("c");
        ll.insert(7);
        System.out.println(ll.printList());
    }
}

class LinkedListNew {
    private Node rootnode;
    
    LinkedListNew() {
        rootnode = new Node();
    }
    
    LinkedListNew(Object o) {
        rootnode = new Node(o);
    }
    
    public void insert(Object data) {
        Node n = rootnode;
        while (n.nextnode != null) {
            n = n.nextnode;
            n.counter++;
        }
        n.nextnode = new Node(data);
    }
    
    public String printList() {
        Node n = rootnode;
        String list = "";
        if (n.nextnode == null) { list += "["+n.getData()+"]["+n.getNextNode()+"] -> "; }
        while (n.nextnode != null) {
            list += "["+n.getData()+"]["+n.getNextNode()+"] -> ";
            n = n.nextnode;
        }
        if (n.nextnode == null) { list += "["+n.getData()+"]["+n.getNextNode()+"]"; }
        return list;
    }
    
    public static void main(String[] args) {
       // for (int i = 0; i < 11; ++i) {
      //      Node n = new Node(i);
            
      //  }
     //   Node n = new Node();
      ///  Node c = new Node("n");
     //   Node c2 = new Node("c");
     //   c.insert(c2);
      //  int num = (int)n.getData();
       // String hes = (String)c.getData();
        
        System.out.println("inside!");
    }
    
    public static class Node {
        private Object data;
        private Node nextnode;
        private static int counter;
        
        public Node() {
            data = 0;
            nextnode = null;
            counter++;
        }
        
        public Node(Object value) {
            data = value;
            nextnode = null;
            counter++;
        }
        
        public Object getData() {
                return data;
        }
        
        public Node getNextNode() {
            return nextnode;
        }
        

    }
}




class LinkedArray {

    public static void main(String[] args) {
        Node n = new Node();
        Node c = new Node("n");
        int num = (int)n.getData();
        String hes = (String)c.getData();
        
        System.out.println("num: "+num+", hes: "+hes);
    }
    
    public static class Node {
        private Object data;
        private Node nextnode;
        private Node rootnode;
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
        
        public void insertNode(Node n) {
            for (int i = 0; i < counter; ++i) {
            }
        }
    }
}

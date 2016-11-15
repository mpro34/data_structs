import java.util.*;
import java.io.*;

class main2 {

    public static void main(String [] args) {
        BinaryTree bt = new BinaryTree();
      //  System.out.println("Current node data: " + bt.getLeftNode());
        bt.insert(6);
        bt.insert(18);
        bt.insert(4);
        bt.insert(15);
        bt.insert(8);
        bt.insert(21);
        System.out.println(" ROOT Node: ["+bt.getRootNode()+"], Count="+bt.size());

     //   System.out.println(" START Current Node: ["+bt.getLeftNode().getData()+"], ["+bt.getRightNode().getData()+"]");

    }

}

class BinaryTree {
    private static int counter = 1;
    private Node root;
    private Node current;
    
    public BinaryTree() {
        root = new Node(10);
        current = root;
    }
    
    public int size() {
        return counter-1;
    }
    
    public Object getRootNode() {
        return root.getData();
    }
    
    public Node getLeftNode() {
        return current.getLeft();
    }
    
    public Node getRightNode() {
        return current.getRight();
    }
    
    /**
     Inserts Nodes based on the following:
     1. Keys in left subtree are < its parent Node; (L < P)
     2. Keys in right subtree are > its parent Node; (R > P)
     */
    public void insert(Object data) {
        current = root;  //Start at the Root node and search down the tree!
        for (int i=0; i < counter; ++i) {
            System.out.println(current.getData() + " <---> "+data);
            if ((int) current.getData() > (int) data && current.getLeft() == null) { //Move data to Left Subtree
                current.setLeft(data);
                System.out.println("A: "+current.getLeft());
            }
            else if (((int) current.getData() > (int) data) && (current.getLeft() != null)) { //Move current to left Node
                System.out.println("B: "+current.getLeft());
                current = current.getLeft();
                counter++;
            }
            else if ((int) current.getData() < (int) data && current.getRight() == null) { //Move data to Right Subtree
                current.setRight(data);
                System.out.println("C: "+current.getRight());
            }
            else if ((int) current.getData() < (int) data && current.getRight() != null) { //Move current to right Node
                System.out.println("D: "+current.getRight());
                current = current.getRight();
                counter++;
            }
        }
    }
}


class Node {
    private Object data;
    private Node LNode;
    private Node RNode;
    
    public Node(Object dataValue) {
        data = dataValue;
        LNode = null;
        RNode = null;
    }
    
    public Object getData() {
        return data;
    }
    
    public Node getLeft() {
        return LNode;
    }
    
    public Node getRight() {
        return RNode;
    }
    public void setLeft(Object value) {
     //           RNode = n.getRight();
        Node left = new Node(value);
        LNode = left;

    }
    
    public void setRight(Object value) {
     //           LNode = n.getLeft();
        Node right = new Node(value);
        RNode = right;

    }

}

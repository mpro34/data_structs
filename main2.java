import java.util.*;
import java.io.*;

class main2 {

    public static void main(String [] args) {
        System.out.println("Hello, World!");
        
        BinaryTree bt = new BinaryTree();
        System.out.println("Current node data: " + bt.getLeftNode());
        bt.insert(5);
        bt.insert(6);
        bt.insert(7);
        bt.insert(8);
        bt.insert(9);
    }

}

class BinaryTree {
    private static int counter = 1;
    private Node root;
    private Node current;
    
    public BinaryTree() {
        root = new Node("root");
        current = root;
    }
    
    public Object getRootNode() {
        return root.getData();
    }
    
    public Object getLeftNode() {
        return current.getLeft();
    }
    
    public Object getRightNode() {
        return current.getRight();
    }
    
    public void insert(Object data) {
        System.out.println(" START Current Node: ["+current.getLeft()+"], ["+current.getRight()+"], ["+current.getData()+"]");
        current = root;
 //       counter++;
        for (int i=0; i < counter; ++i) {
            if (current.getLeft() == null && current.getRight() == null) {
          //  Node lr = new Node(data);
                current.setLeft(data);
               // counter++;
        //    System.out.println("Current node dataLeft: " + current.getLeft());
           // current = l;
          //  System.out.println("left");
            }
            else if (current.getRight() == null && current.getLeft() != null) {
        //    Node lr = new Node(data);
                current.setRight(data);
           //     counter++;
         //   current = l;
    //        System.out.println("right");
        //    current = current.getLeft();
            }
            else if (current.getLeft().getLeft() == null && current.getLeft() != null) {
                System.out.println("Here?");
                current = current.getLeft();
                current.setLeft(data);
            //    counter++;
            }
            else if (current.getLeft().getRight() == null && current.getLeft() != null) {
                System.out.println("Here?R");
           //     current = current.getLeft();
                current.setRight(data);
                //    counter++;
            }
            else if (current.getRight().getLeft() == null && current.getRight() != null) {
                System.out.println("Here!!");

                current = current.getRight();
                current.setLeft(data);
              //  counter++;
            }
            else if (current.getRight().getRight() == null && current.getRight() != null) {
                System.out.println("Here!RR");
                
              //  current = current.getRight();
                current.setRight(data);
                //  counter++;
            }
        }
       // counter++;
                System.out.println(" END Current Node: ["+current.getLeft()+"], ["+current.getRight()+"], ["+current.getData()+"]");
       // System.out.println("Current node dataRight: " + root.getRight());

    }
    
    public void size() {
        
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

import java.util.*;
import java.io.*;

class main2 {

    public static void main(String [] args) {
        System.out.println("Hello, World!");
        
        BinaryTree bt = new BinaryTree();
        System.out.println(bt.getNodeData());
        bt.insert(5);
        bt.insert(6);
        System.out.println(bt.getNodeData());
    }

}

class BinaryTree {
    private static int counter;
    private Node root;
    private Node current;
    
    public BinaryTree() {
        root = new Node("root");
        current = root;
    }
    
    public Object getNodeData() {
        return current.getData();
    }
    
    public void insert(Object data) {
        if (current.getLeft() == null) {
            current.setLeft(data);
        }
        else if (current.getRight() == null) {
            current.setRight(data);
        }
        
    }
}


class Node {
    private static Object data;
    private static Node LNode;
    private static Node RNode;
    
    public Node(Object dataValue) {
        data = dataValue;
        LNode = null;
        RNode = null;
    }
    
    public static Object getData() {
        return data;
    }
    
    public static Node getLeft() {
        return LNode;
    }
    
    public static Node getRight() {
        return RNode;
    }
    public static void setLeft(Object value) {
        Node n = new Node(value);
        LNode = n;
    }
    
    public static void setRight(Object value) {
        Node n = new Node(value);
        RNode = n;
    }

}

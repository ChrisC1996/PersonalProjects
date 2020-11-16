package com.sparta.chris;

import javax.enterprise.inject.Alternative;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

@Alternative
public class BinaryTreeClass extends Sorter implements BinaryTreeInterface {

    Node root = null;

    public int numberOfNodes = 0;
    public LinkedList<Node> nodeList = new LinkedList<>();
    public ArrayList<Integer> sortedList = new ArrayList<>();

    public void addElement(int element) {
        addNode(root, element);
    }

    public Node addNode(Node parent, int element) {
        Node node = new Node();
        node.value = element;

        if(parent == null) {
//            System.out.println(node.value + " " + node.leftNode + " " + node.rightNode);
            this.root = node;
            return node;
        }

        if(element < parent.value) {
            if(parent.leftNode == null) {
                parent.setLeftNode(node);
//                System.out.println(node.value + " " + node.leftNode + " " + node.rightNode);
                return node;
            }
            else {
                addNode(parent.leftNode, element);
            }
        }

        else if(element >= parent.value) {
            if (parent.rightNode == null) {
                parent.setRightNode(node);
//                System.out.println(node.value + " " + node.leftNode + " " + node.rightNode);
                return node;
            } else {
                addNode(parent.rightNode, element);
            }
        }

        return node;
    }

    public void addElements(int[] elements) {
        for(int element: elements) {
            addElement(element);
        }
    }

    public int getRootElement() {
        return root.value;
    }

    public int getNumberOfElements() {
        traverseTree(root);
        return numberOfNodes;
    }

    public void traverseTree(Node node) {

        if(node == null)
            return;

        System.out.println(node + " " + node.value + " " + node.leftNode + " " + node.rightNode);
        numberOfNodes++;

//        nodeList.add(node);

        traverseTree(node.leftNode);
        traverseTree(node.rightNode);
        }

    public void sortTree(boolean sortASC) {
        sort(sortASC, root);
        Printer.print(Arrays.toString(sortedList.toArray()));
    }

    public void sort(boolean direction, Node node) {

        if(direction) {
            if(node != null) { //make this exception
                sort(direction, node.leftNode);
                sortedList.add(node.value);
                sort(direction, node.rightNode);
            }
        }
        else {
            if(node != null) { //make this exception
                sort(direction, node.rightNode);
                sortedList.add(node.value);
                sort(direction, node.leftNode);
            }
        }

    }

}

package com.zipcodewilmington.singlylinkedlist;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node[] singlyLinkedList = new Node[0];
    public SinglyLinkedList() {}
    public SinglyLinkedList(Node[] nodeArray) {
        singlyLinkedList = nodeArray;
    }
    public void add(Node node) {
        Node[] singlyLinkedListCopy = new Node[singlyLinkedList.length + 1];
        System.arraycopy(singlyLinkedList, 0, singlyLinkedListCopy, 0, singlyLinkedList.length);
        singlyLinkedListCopy[singlyLinkedList.length] = node;
        singlyLinkedList = singlyLinkedListCopy;
    }

    public void remove(Node node) {
        if (contains(node)) {
            Integer indexOfRemoval = find(node);
            Node[] singlyLinkedListCopy = new Node[singlyLinkedList.length - 1];
            for (int i = 0; i < indexOfRemoval; i++) {
                singlyLinkedListCopy[i] = singlyLinkedList[i];
            }
            for (int i = indexOfRemoval; i < singlyLinkedListCopy.length; i++) {
                singlyLinkedListCopy[i] = singlyLinkedList[i+1];
            }
            singlyLinkedList = singlyLinkedListCopy;
        }
    }

    public Node get(Integer index) {
        if (index >= singlyLinkedList.length) return null;
        return singlyLinkedList[index];
    }

    public Boolean contains(Node node) {
        for (Node n : singlyLinkedList) {
            if (node.equals(n)) return true;
        }
        return false;
    }

    public Integer find(Node node) {
        for (int i = 0; i < singlyLinkedList.length; i++) {
            if (singlyLinkedList[i].equals(node)) return i;
        }
        return -1;
    }

    public void sort() {
        Arrays.sort(singlyLinkedList);
    }

    public Integer size() {
        return singlyLinkedList.length;
    }

    public Node[] copy() {
        SinglyLinkedList clone = new SinglyLinkedList(singlyLinkedList);
        return clone.getSinglyLinkedList();
    }

    public Node[] getSinglyLinkedList() {
        return singlyLinkedList;
    }
}

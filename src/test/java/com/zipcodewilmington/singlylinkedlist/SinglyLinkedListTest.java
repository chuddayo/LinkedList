package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        Node nodeMister = new Node();
        list.add(nodeMister);

        Node actual = list.get(0);

        Assert.assertEquals(nodeMister, actual);
    }

    @Test
    public void addTest2() {
        SinglyLinkedList list = new SinglyLinkedList();
        Node nodeMister = new Node();
        list.add(nodeMister);
        Node nodeMister2 = new Node();
        list.add(nodeMister2);
        Node nodeMister3 = new Node();
        list.add(nodeMister3);

        Integer expected = 3;

        Assert.assertEquals(expected, list.size());
    }

    @Test
    public void getNullTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        Assert.assertNull(list.get(0));
    }

    @Test
    public void removeTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        Node nodeMister = new Node();
        list.add(nodeMister);
        Node nodeMister2 = new Node();
        list.add(nodeMister2);
        Node nodeMister3 = new Node();
        list.add(nodeMister3);

        list.remove(nodeMister2);

        Integer expectedSize = 2;

        Assert.assertEquals(expectedSize, list.size());
        Assert.assertNull(list.get(2));
    }

    @Test
    public void copyTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        Node nodeMister = new Node();
        list.add(nodeMister);
        Node nodeMister2 = new Node();
        list.add(nodeMister2);
        Node nodeMister3 = new Node();
        list.add(nodeMister3);

        Node[] listCopy = list.copy();

        Assert.assertArrayEquals(list.getSinglyLinkedList(), listCopy);
    }
}

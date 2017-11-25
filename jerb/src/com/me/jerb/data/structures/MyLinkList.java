package com.me.jerb.data.structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkList implements List {
    int size;
    MyLinkListNode head;

    public MyLinkList(){
        this.head = new MyLinkListNode(null, null, null);
        size=0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public void print(){
        MyLinkListNode n = this.head;

        System.out.println("Entering printing function.....");

        while(n.getNext() != null){
            n = n.getNext();
            System.out.println("[" + n.getValue() + "]");
        }

    }


    @Override
    public boolean add(Object o) {
        MyLinkListNode n = this.head;

        while(n.getNext() != null){
            n = n.getNext();
        }

        n.setNext(new MyLinkListNode(o, n, null));
        this.size++;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        MyLinkListNode n = this.head.getNext();
        /*
        while(n.getNext() != null){
            n = n.getNext();
        }
        */

        for(int i=0; i<index; i++){
            n = n.getNext();
        }

        return n.getValue();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

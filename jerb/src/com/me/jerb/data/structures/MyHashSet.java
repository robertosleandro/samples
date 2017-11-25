package com.me.jerb.data.structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet implements Set{
    MyHashMap map;
    int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if(this.map != null){
            if(this.map.get(o.hashCode()) != null)
                return true;
        }
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

    @Override
    public boolean add(Object o) {
        boolean contains = false;

        if(this.map == null){
            this.map = new MyHashMap();
        }

        if(this.map.get(o.hashCode()) != null){
            contains = true;
        }else{
            contains = false;
            this.size++;
        }
        this.map.put(o.hashCode(), o);

        return contains;
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
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
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

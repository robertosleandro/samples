package com.me.jerb.data.structures;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap implements Map {
    int BUCKET_SIZE = 1000;
    int size = 0;

    MyLinkList[] array = new MyLinkList[BUCKET_SIZE];

    private int calcHash(Object key){
        int hash = key.hashCode();
        while(hash > BUCKET_SIZE){
            hash/=2;
        }
        return hash;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        int hash = calcHash(key);
        HashNode hn = null;

        if(array[hash] != null){
            if(array[hash].size() > 1){
                for(int i=0; i<array[hash].size(); i++){
                    if (array[hash].get(i) != null) {
                        hn = (HashNode) array[hash].get(i);
                        if(hn.getKey().equals(key)){
                            return hn.getValue();
                        }
                    }
                }
            }else{
                hn = (HashNode) array[hash].get(0);
                return hn.getValue();
            }
        }

        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int hash = calcHash(key);

        if(array[hash] == null){
            array[hash] = new MyLinkList();
        }

        size++;

        return array[hash].add(new HashNode(key, value));
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}

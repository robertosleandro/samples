package com.me.jerb.data.structures;

public class HashNode {
    Object key;
    Object value;

    public HashNode(Object key, Object value){
        this.key = key;
        this.value = value;
    }

    public Object getKey(){
        return this.key;
    }

    public Object getValue(){
        return this.value;
    }
}

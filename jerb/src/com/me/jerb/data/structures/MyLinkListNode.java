package com.me.jerb.data.structures;

public class MyLinkListNode {
    MyLinkListNode last, next;
    Object value;

    public MyLinkListNode(Object o, MyLinkListNode last, MyLinkListNode next){
        this.value = o;
        this.last = last;
        this.next = next;
    }

    public void setNext(MyLinkListNode n){
        this.next = n;
    }


    public Object getValue(){
        return this.value;
    }

    public MyLinkListNode getLast(){
        return this.last;
    }

    public MyLinkListNode getNext(){
        return this.next;
    }







}

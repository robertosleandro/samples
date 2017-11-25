package com.me.jerb.test;

public abstract class MyAbTest {

    public static void assertEquals(Object o1, Object o2) throws Exception{
        if(o1.equals(o2)){
            return;
        }

        throw new Exception("Assert Equals failed! " + o1 + " does not equal " + o2);
    }



}

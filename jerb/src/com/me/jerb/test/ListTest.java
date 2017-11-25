package com.me.jerb.test;

import java.util.List;

public class ListTest extends MyAbTest{

    public static void testList(List l) throws Exception{
        for(int i=0; i<999; i++){
            l.add(i);
        }


        //TODO need to research what assert does in java

        System.out.println("Starting testing......");

        assertEquals((Integer) l.get(250), 250);
        assertEquals((Integer) l.get(998), 998);
        assertEquals((Integer) l.get(0), 0);


        System.out.println("Testing complete!");

    }


}

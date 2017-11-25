package com.me.jerb;

import com.me.jerb.data.structures.*;
import com.me.jerb.strings.MyStringBuilder;
import com.me.jerb.test.ListTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception{

    }


    public static String betterUrlify(String input){
        char[] array = input.toCharArray();

        int spaceCount = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == ' '){
                spaceCount++;
            }
        }

        char[] output = new char[array.length + (spaceCount*2)];
        int spaceCounter=0;

        for(int i=0; i<array.length; i++){

            if(array[i] == ' '){
                output[i+(spaceCounter*2)] = '%';
                output[i+1+(spaceCounter*2)] = '2';
                output[i+2+(spaceCounter*2)] = '0';
                spaceCounter++;
            }else{
                int value = i + (spaceCounter*2);
                output[i+(spaceCounter*2)] = array[i];
            }
        }

        return new String(output);
    }


    public static String urlify(String input){
        char[] array = input.toCharArray();

        List<Character> list = new ArrayList<Character>();

        for(int i=0; i<array.length; i++){
            list.add(array[i]);
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == ' '){
                list.set(i, '%');

                List<Character> subset = new ArrayList<Character>();
                int j=i+1;

                while(j<list.size()){
                    subset.add(list.get(j));
                    list.remove(j);
                }

                list.add('2');
                list.add('0');
                list.addAll(subset);
            }
        }

        char[] output = new char[list.size()];

        for(int i=0; i<list.size(); i++){
            output[i] = list.get(i).charValue();
        }

        return new String(output);
    }

    public static List<Object> removeDuplicates(List<Object> input){

        for(int i=0; i<input.size(); i++){
            for(int j=i+1; j<input.size(); i++){
                if(input.get(i).equals(input.get(j))){
                    input.remove(j);

                    break;
                }
            }
        }

        return input;
    }


    public static boolean isPremutation(String a, String b){
        if(a.length() > b.length()){
            String temp = "";
            temp = b;
            b = a;
            a = temp;
        }

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        boolean[] match = new boolean[aArray.length];
        int count=0;

        for(int i=0; i<aArray.length; i++){
            if(count == a.length())
                break;

            for(int j=0; j<bArray.length; j++){
                if(aArray[i] == bArray[j]){
                    match[i] = true;
                    bArray[j] = 0;
                    count++;
                    break;
                }
            }
        }

        if(count == a.length())
            return true;

        return false;
    }



    public static boolean containsUniqueCharacters(String input){
        char[] charArray = input.toCharArray();
        int count=0;


        for(int i=0; i<charArray.length; i++){
            count++;
            for(int j=i+1; j<charArray.length; j++){
                count++;
                if(charArray[i] == charArray[j]){
                    System.out.println("Count: " + count);

                    return false;
                }
            }
        }

        System.out.println("Count: " + count);

        return true;

    }

}

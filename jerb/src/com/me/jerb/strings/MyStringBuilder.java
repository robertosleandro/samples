package com.me.jerb.strings;

public class MyStringBuilder {
    char[] array = new char[0];

    public void append(String input){
        if(array.length == 0){
                array = input.toCharArray();
        }else{
            char[] temp = new char[array.length + input.length()];

            for(int i=0; i< array.length; i++){
                temp[i] = array[i];
            }

            int count=0;
            for(int i=array.length; i< temp.length; i++){
                temp[i] = input.charAt(count);
                count++;
            }

            array = temp;

        }
    }

    public String toString(){
        return new String(this.array);
    }

}

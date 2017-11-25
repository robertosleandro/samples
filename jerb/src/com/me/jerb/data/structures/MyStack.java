package com.me.jerb.data.structures;

public class MyStack{

    Object[] array = new Object[1];
    int size = 0;

    public void push(Object input){
        if(this.size < this.array.length){
            this.array[size] = input;
            size++;
        }else{
            Object[] newArray = new Object[size*2];

            for(int i=0; i<this.array.length; i++){
                newArray[i] = this.array[i];
            }
            this.array = newArray;

            this.array[this.size] = input;
            this.size++;
        }
    }

    public void pop(){
        if(this.size > 0){
            this.array[this.size-1] = null;
            this.size--;
        }


        //space vs time tradeoff here. Trying free up some memory, while running the risk of constantly creating new arrays...

        /*
        if(this.array.length > this.size*2){
            Object[] newArray = new Object[this.size];
            for(int i=0; i<newArray.length; i++){
                newArray[i] = this.array[i];
            }

            this.array = newArray;
        }
        */

    }

    public Object peek(){
        if(this.size > 0){
            return this.array[this.size-1];
        }
        return null;
    }


}

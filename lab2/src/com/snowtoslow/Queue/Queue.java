package com.snowtoslow.Queue;
import java.util.ArrayList;
import java.util.List;

public class Queue {

    private boolean hasParam;
    private int maxSize;
    public List list = new ArrayList();

    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.list = new ArrayList();
        this.hasParam = true;
    }

    public Queue() {
        this.list = new ArrayList();
        this.hasParam = false;

    }

    public void push(int number){
        list.add(number);
    }
    public void pop(){
        list.remove(list.get(0));
    }

    public String isFull(int length, List list){
        if(length > list.size() && hasParam == true){
            return "Is empty";
        }else if (length == 0 && hasParam == false){
           return "Is empty";
        }
        return "Is Full";
    }




}

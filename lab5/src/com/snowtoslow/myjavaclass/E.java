package com.snowtoslow.myjavaclass;

public class E extends D{

    protected String e;

    public E(String a, String b, String c, String d,String e) {
        super(a, b, c, d);
        this.e = e;
    }


    @Override
    public void print(){
        System.out.println(e);
    }
}

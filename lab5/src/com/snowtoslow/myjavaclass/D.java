package com.snowtoslow.myjavaclass;

public class D extends C{

    protected String d;

    public D(String a, String b, String c,String d) {
        super(a, b, c);
        this.d = d;
    }


    @Override
    public void print(){
        System.out.println(d);
    }
}

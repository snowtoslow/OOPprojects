package com.snowtoslow.myjavaclass;

public class C extends B {

    public String c;

    public C(String a, String b,String c) {
        super(a, b);
        this.c = c;
    }


    @Override
    public void print(){
        System.out.println(c);
    }
}

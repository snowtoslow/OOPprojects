package com.snowtoslow.myjavaclass;

public class B extends A {

    protected String b;

    public B(String a, String b) {
        super(a);
        this.b = b;
    }

    @Override
    public void print(){
        System.out.println(b);
    }
}

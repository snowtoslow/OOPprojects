package com.snowtoslow.myjavaclass;

public class F extends E{

    protected String f;

    public F(String a, String b, String c, String d, String e, String f) {
        super(a, b, c, d, e);
        this.f = f;
    }

    @Override
    public void print(){
        System.out.println(f);
    }
}

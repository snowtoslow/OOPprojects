package com.snowtoslow.myjavaclass;

public class H extends G{

    protected String h;

    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
        super(a, b, c, d, e, f, g);
        this.h = h;
    }

    @Override
    public void print(){
        System.out.println(h);
    }
}

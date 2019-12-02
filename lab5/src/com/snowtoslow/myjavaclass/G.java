package com.snowtoslow.myjavaclass;

public class G extends F{

    protected String g;

    public G(String a, String b, String c, String d, String e, String f,String g) {
        super(a, b, c, d, e, f);
        this.g = g;

    }

    @Override
    public void print(){
        System.out.println (g);
    }
}

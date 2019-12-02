package com.snowtoslow.myjavaclass;


public class J extends I{

    protected String j;



    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i,String j) {

        super(a, b, c, d, e, f, g, h, i);

        this.j=j;

    }

    public void print(){
        System.out.println(j);
    }
}

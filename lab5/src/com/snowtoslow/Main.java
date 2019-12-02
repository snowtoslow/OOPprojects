package com.snowtoslow;

import com.snowtoslow.myjavaclass.*;

public class Main {



    public static void main(String[] args) {


        A objectA = new A(Letters.a);
        B objectB = new B(Letters.a,Letters.b);
        C objectC = new C(Letters.a,Letters.b,Letters.c);
        D objectD = new D(Letters.a,Letters.b,Letters.c,Letters.d);
        E objectE = new E(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e);
        F objectF = new F(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e,Letters.f);
        G objectG = new G(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e,Letters.f,Letters.g);
        H objectH = new H(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e,Letters.f,Letters.g,Letters.h);
        I objectI = new I(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e,Letters.f,Letters.g,Letters.h,Letters.i);
        J objectJ = new J(Letters.a,Letters.b,Letters.c,Letters.d,Letters.e,Letters.f,Letters.g,Letters.h,Letters.i,Letters.j);

        objectA.print();
        objectB.print();
        objectC.print();
        objectD.print();
        objectE.print();
        objectF.print();
        objectG.print();
        objectH.print();
        objectI.print();
        objectJ.print();


    }
}

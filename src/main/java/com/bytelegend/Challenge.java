package com.bytelegend;

import javax.print.DocFlavor;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        String msg;
        msg="hello";
        return msg;
    }

    public static int add(int a,int b) {
        int result;
        result=a+b;
        return  result;
    }
}

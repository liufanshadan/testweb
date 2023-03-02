package com.example.testweb.test;

public class Test111 {
    public static void main(String[] args) {
        String str = "<return><age>18</age><name>liufan</name></return>";
        int length = str.length();
        System.out.println(str.substring(8,length-9));
    }
}

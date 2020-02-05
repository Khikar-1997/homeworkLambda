package com.company;

public class Main {

    public static void main(String[] args) {
        String text;
        myMethod(MyClass::myStaticMethod);
    }

    private static void myMethod(MyFunc func) {
        func.func();
    }
}

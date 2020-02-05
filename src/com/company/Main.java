package com.company;

public class Main {

    public static void main(String[] args) {
        MyClass mcObj1 = new MyClass();
        MyFunc myFunc = mcObj1::myinstMethod;
        myFunc.func();
    }
}

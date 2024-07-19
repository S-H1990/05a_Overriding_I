package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
     Child Child = new Child();
     output(Child.sayHello());
     output(Child.sayHello("Hi from"));
       

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


package com.company;

public class Main {

    // --- JS
    // (x, y) => {}
    // function add(a,b) {
    //  return a + b
    // }
    //---------------------------

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        //main(new String[] {"a", "b"});

        // --- JS
        //main(["a", "b"]);

        System.out.println(add(3, 4));

        System.out.println(Calculator.min(7, 4));
    }
}

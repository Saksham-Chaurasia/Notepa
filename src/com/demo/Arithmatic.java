package com.demo;

public class Arithmatic {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int multi(int x, int y) {

        return x * y;
    }

    public static void main(String[] args) {
        Arithmatic art = new Arithmatic();

        System.out.println("adding " + art.add(4, 5));
        System.out.println("subtracting " + art.sub(5, 3));
        System.out.println("dividing " + art.div(6, 2));
        System.out.println("multiplying " + art.div(5, 3));
    }
}

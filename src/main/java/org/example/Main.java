package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* Here using lambda expression*/

        MyFunctionalInterface i = (a,b)->{
            int c = a+b;
            System.out.println("Sum of two int is : "+c);
        };
        i.getSum(5,11);
    }
}
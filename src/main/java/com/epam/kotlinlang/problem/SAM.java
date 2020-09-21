package com.epam.kotlinlang.problem;

import java.util.function.Consumer;

public class SAM {

    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
    }
}
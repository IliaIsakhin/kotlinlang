package com.epam.kotlinlang;

import java.util.stream.Stream;

public class Functions {

    public static void main(String[] args) {
        int a = 0;

        Stream.of(1, 2, 3).forEach( i -> {
//            a += i;
        });

        System.out.println(a);
    }
}

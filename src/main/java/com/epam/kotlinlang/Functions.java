package com.epam.kotlinlang;

import java.util.stream.Stream;

public class Functions {

    public static void main(String[] args) {
        final int[] a = {0};

        Stream.of(1, 2, 3).forEach( i -> {
            a[0] += i;
        });

        System.out.println(a[0]);
    }
}

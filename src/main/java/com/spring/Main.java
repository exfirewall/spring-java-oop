package com.spring;

import com.spring.logic.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        BubbleSort<String> bubblesort = new BubbleSort<>();

        System.out.println(" [result] : " + bubblesort.sort(Arrays.asList(args)));
    }
}

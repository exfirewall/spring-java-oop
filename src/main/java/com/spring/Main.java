package com.spring;

import com.spring.logic.BubbleSort;
import com.spring.logic.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Sort<String> bubblesort = new BubbleSort<>();

        System.out.println(" [result] : " + bubblesort.sort(Arrays.asList(args)));
    }
}

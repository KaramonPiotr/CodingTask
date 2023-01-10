package org.example;

import org.example.balancedwords.BalancedWordsCounter;
import org.example.bubblesort.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BalancedWordsCounter counter = new BalancedWordsCounter();
        System.out.println(counter.count("aabbcbcccbaa"));
        BubbleSort sort = new BubbleSort();
        ArrayList<String> test = new ArrayList<>();
        test.add("bb");
        test.add("aa");
        List<Comparable> input = Arrays.asList(-9.3,0.2,4,0.1,5,9);
        System.out.println(sort.sort(input));
        System.out.println(sort.sort(test));
    }
}
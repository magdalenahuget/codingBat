package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Given a list of integers, return a list of those numbers squared and the product added to 10,
// omitting any of the resulting numbers that end in 5 or 6.

public class Square56 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(square56(list1));
    }

    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }
}
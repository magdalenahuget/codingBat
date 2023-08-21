package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of non-negative integers, return a list of those numbers multiplied
// by 2, omitting any of the resulting numbers that end in 2.

public class Two2 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(two2(list1));
    }

    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
    }

}
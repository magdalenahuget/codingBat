package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list of those numbers, omitting any that are between
// 13 and 19 inclusive.

public class NoTeen {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, -2, 13, 209);
        System.out.println(noTeen(list1));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n > 19 || n < 13).collect(Collectors.toList());
    }
}
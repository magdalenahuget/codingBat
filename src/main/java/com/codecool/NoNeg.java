package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list of the integers, omitting any that are less than 0.

public class NoNeg {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, -2, 3);
        System.out.println(noNeg(list1));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }
}
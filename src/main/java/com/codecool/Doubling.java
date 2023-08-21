package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is multiplied by 2.

public class Doubling {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(doubling(list1));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(num->num*2).collect(Collectors.toList());
    }
}
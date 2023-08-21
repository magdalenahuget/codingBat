package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//
//Given a list of integers, return a list where each integer is added
// to 1 and the result is multiplied by 10.

public class Math1 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(math1(list1));
    }

    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(n->(n+1)*10).collect(Collectors.toList());
    }
}
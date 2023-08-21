package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is multiplied with itself.

public class Square {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        System.out.println(square(list1));
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n-> n*n).collect(Collectors.toList());
    }
}
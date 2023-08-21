package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is multiplied with itself.

public class RightDigit {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(101, 222, 32);
        System.out.println(rightDigit(list1));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        // List<Integer> result = new ArrayList<>();
        //     for (int num : nums) {
        //         result.add(num % 10);
        //     }
        // return result;

        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}
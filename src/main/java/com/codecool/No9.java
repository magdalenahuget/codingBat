package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.codecool.NoNeg.noNeg;

//
//Given a list of non-negative integers, return a list of those numbers except
// omitting any that end with 9. (Note: % by 10)

public class No9 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Integer> list1 = Arrays.asList(1, -2, 13, 209);
        System.out.println(no9(list1));
    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n-> n%10 !=9).collect(Collectors.toList());
    }
}
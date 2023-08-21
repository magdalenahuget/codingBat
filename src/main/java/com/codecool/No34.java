package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

public class No34 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAxzxxAa", "xbb", "zCCccx");
        System.out.println(no34(list1));
    }

    public static List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() !=4 && s.length() != 3)
                .collect(Collectors.toList());
    }

}
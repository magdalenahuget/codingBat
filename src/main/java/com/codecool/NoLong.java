package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any string length 4 or more.

public class NoLong {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAxzxxAa", "xbb", "zCCccx");
        System.out.println(noLong(list1));
    }

    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(s-> s.length() <4).collect(Collectors.toList());
    }

}
package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//iven a list of strings, return a list where each string has all its "x" removed.

public class NoX {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAxxxAa", "xBbb", "CCccx");
        System.out.println(noX(list1));
    }

    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
}
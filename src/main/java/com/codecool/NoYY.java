package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string has "y" added at its end,
//omitting any resulting strings that contain "yy" as a substring anywhere.


public class NoYY {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAxzxxyyAa", "xbb", "zCCccx");
        System.out.println(noYY(list1));
    }

    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(s->s+"y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

}
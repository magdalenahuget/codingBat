package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any
// string that contains a "z". (Note: the str.contains(x) method returns a boolean)

public class NoZ {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAxzxxAa", "xBbb", "zCCccx");
        System.out.println(noZ(list1));
    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }
}
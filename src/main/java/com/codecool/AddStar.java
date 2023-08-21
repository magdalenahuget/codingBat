package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string has "*" added at its end.

public class AddStar {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        System.out.println(addStar(list1));
    }

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(s-> s.concat("*")).collect(Collectors.toList());
    }
}
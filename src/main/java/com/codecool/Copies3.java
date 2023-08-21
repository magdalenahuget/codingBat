package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings,
// return a list where each string is replaced by 3 copies of the string concatenated together.

public class Copies3 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        System.out.println(copies3(list1));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }
}
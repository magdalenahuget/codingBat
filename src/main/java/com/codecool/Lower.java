package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string
// is converted to lower case (Note: String toLowerCase() method).

public class Lower {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aAAa", "Bbb", "CCcc");
        System.out.println(lower(list1));
    }

    public static List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
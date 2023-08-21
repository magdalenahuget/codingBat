package com.codecool;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, return a list where each string has "y" added at its start and end.

public class MoreY {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        System.out.println(moreY(list1));
    }

    public static List<String> moreY(List<String> strings) {
        String y = "y";
        strings.replaceAll(s-> y + s + y);
        return strings;
    }
}
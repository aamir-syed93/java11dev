package com.dev.java11;

import java.util.List;

public class FirstJava {
    public static void main(String[] args) {
        List<String> myList = List.of("Adam", "James", "Mindy", "Lisa", "Robert");

        myList.stream().forEach(System.out::println);
    }
}

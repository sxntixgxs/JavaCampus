package com.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("uno","dos","tres");
        lista.forEach(e -> System.out.println(e));
    }
}
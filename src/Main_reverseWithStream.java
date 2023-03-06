package src;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Main_reverseWithStream {
    public static void main(String[] args) {

        // sample string

        String str = "quick brown fox jumps over lazy dog";

        String finalStr = Arrays.stream(str.split(" ")).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining());

        // reverse a String using Java 8
        String reverseStr = Arrays
                .stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println("Original String = " + str);
        System.out.println("Reversed String = " + finalStr);


        // print both string length to console
        System.out.println("\n\nOriginal String length = " + str.length());
        System.out.println("Reversed String length = " + reverseStr.length());
    };
}
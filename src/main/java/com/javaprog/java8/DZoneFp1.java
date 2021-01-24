package com.javaprog.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by abhishek.k on 7/6/17.
 * ref: https://dzone.com/articles/java-8-concepts-fp-lambda-expressions-and-streams
 */
public class DZoneFp1 {
    /* A stream is a sequence of elements supporting sequential and parallel aggregate operations */
    /* Lambda expressions are much like anonymous functions */
    /* In FP, the functions do not modify the state of the program */
    public static void main(String[] args) {
        Map<String, List<String>> phoneNumbers = new HashMap<>();

        phoneNumbers.put("John Wick", Arrays.asList("3232312323", "8933555472"));
        phoneNumbers.put("Mary Jane", Arrays.asList("12323344", "492648333"));
        phoneNumbers.put("Mary Lou", Arrays.asList("77323344", "938448333"));

        Map<String, List<String>> filteredNumbers = phoneNumbers.entrySet().stream()
                .filter(x -> x.getKey().contains("Mary"))   // Predicates are boolean-valued functions of one argument
                .collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));

        filteredNumbers.forEach((key, value) -> {       // here, (key, value) are args to the anonymous function
            System.out.println("Name: "+ key + ": ");
            value.forEach(System.out::println); // Java 8 enables you to pass references of methods or constructors via the :: keyword
        });
    }
}

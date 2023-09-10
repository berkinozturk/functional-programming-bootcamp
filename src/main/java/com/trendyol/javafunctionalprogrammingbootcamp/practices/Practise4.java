package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.Comparator;
import java.util.List;

public class Practise4 {

    public List<String> orderByLength(List<String> strings, boolean decreasing) {
        // TODO: implement method that accepts list of strings and a boolean which indicates order way
        // TODO: returns them ordering by their length.

        if(!decreasing)
            return strings.stream().sorted((a,b) -> a.length() > b.length() ? 1 : a.length() == b.length() ? 0 : -1).toList();
        else
            return strings.stream().sorted((a,b) -> a.length() < b.length() ? 1 : a.length() == b.length() ? 0 : -1).toList();
    }
}

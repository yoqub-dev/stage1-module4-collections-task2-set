package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (int x : sourceList) {
            if (x % 2 == 0) {
                result.add(1); // Adding 1 for even numbers
                while (x % 2 == 0) {
                    result.add(x);
                    x /= 2;
                }
            } else {
                result.add(x);
                result.add(2 * x);
            }
        }

        return result;
    }
}

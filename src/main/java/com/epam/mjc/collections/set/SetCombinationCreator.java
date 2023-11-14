package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        result.removeAll(thirdSet);

        Set<String> exclusiveThirdSetElements = new HashSet<>(thirdSet);
        exclusiveThirdSetElements.removeAll(firstSet);
        exclusiveThirdSetElements.removeAll(secondSet);

        result.addAll(exclusiveThirdSetElements);

        return result;
    }
}

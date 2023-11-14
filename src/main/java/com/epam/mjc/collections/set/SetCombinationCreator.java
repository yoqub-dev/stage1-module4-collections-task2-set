package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        // Elements that belong to the first and the second Sets and not belong to the third Set
        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                result.add(element);
            }
        }

        // Elements that belong only to the third Set
        result.addAll(thirdSet);

        // Sort the result set to make the order consistent based on names
        List<String> resultList = new ArrayList<>(result);
        Collections.sort(resultList);

        return new LinkedHashSet<>(resultList);
    }
}

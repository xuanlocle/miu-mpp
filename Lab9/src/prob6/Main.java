package prob6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Set<String>> sets = new ArrayList<>() {
            {
                add(new HashSet<>(Arrays.asList("A", "B")));
                add(new HashSet<>(Arrays.asList("D")));
                add(new HashSet<>(Arrays.asList("1", "3", "5")));
            }
        };

        Set<String> set = union(sets);
        System.out.println(set);
    }
}

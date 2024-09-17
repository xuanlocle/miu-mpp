package prob4;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};
        Arrays.sort(names, String::compareToIgnoreCase);
        Arrays.stream(names).toList().forEach(System.out::println);
    }
}

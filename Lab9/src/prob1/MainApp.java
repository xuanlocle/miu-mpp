package prob1;

import java.util.List;

public class MainApp {

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> len == word.length())
                .filter(word -> word.contains(c + ""))
                .filter(word -> !word.contains(d + ""))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(countWords(List.of("abc", "def", "abcdef", "asd"), 'c', 's', 3));
    }
}

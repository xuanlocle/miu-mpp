package prob2;

import java.util.stream.IntStream;

public class MainApp {
    public static void printSquares(int num) {
        IntStream.iterate(1, n -> n + 1)
                .map(n -> n * n)
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);
    }
}

package prob7;

import java.util.List;
import java.util.stream.Collectors;


public class LambdaLibrary {
    public static boolean FILTERED_NAMES_BY_SALARY_AND_LAST_NAME(List<Employee> list, int i, String m) {
        return false;
    }

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static final TriFunction<List<Employee>, Integer, Character, String>
            FILTERED_NAMES_BY_SALARY_AND_LAST_NAME = (employees, salary, character) ->
            employees
            .stream().filter(employee -> employee.getSalary() > salary)
            .filter(employee -> employee.getLastName().charAt(0) > character)
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));
}

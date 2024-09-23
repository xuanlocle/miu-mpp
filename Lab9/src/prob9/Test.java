package src.prob9;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        // a. Is there any Vegetarian meal available ( return type boolean)
        boolean isAnyVegetarianAvailable = Dish.menu.stream().anyMatch(Dish::isVegetarian);
        System.out.println("Is there any Vegetarian meal available: " + isAnyVegetarianAvailable);

        // b. Is there any healthy menu have calories less than 1000 ( return type boolean)
        boolean isAnyHealthyCaloriesLessThan1000 = Dish.menu.stream().anyMatch(e -> e.getCalories() < 1000);
        System.out.println("Is there any healthy menu have calories less than 1000: " + isAnyHealthyCaloriesLessThan1000);

        // c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
        boolean isAnyHealthyCaloriesGreaterThan1000 = Dish.menu.stream().anyMatch(e -> e.getCalories() > 1000);
        System.out.println("Is there any healthy menu have calories greater than 1000: " + isAnyHealthyCaloriesGreaterThan1000);

        // d. find and return the first item for the type of MEAT( return type Optional<Dish>)
        Optional<Dish> firstItemOfTypeMeat = Dish.menu.stream()
                .filter(e -> e.getType() == Dish.Type.MEAT)
                .findFirst();
        firstItemOfTypeMeat.ifPresentOrElse(e -> System.out.println("First item for the type of MEAT: " + e),
                () -> System.out.println("NOT FOUND first item for the type of MEAT"));

        // e. calculateTotalCalories() in the menu using reduce. (return int)
        int calculateTotalCalories = Dish.menu.stream()
                .map(e -> e.getCalories())
                .reduce(0, (x, y) -> x + y);
        System.out.println("calculateTotalCalories = " + calculateTotalCalories);

        // f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
        int calculateTotalCaloriesMethodReference = Dish.menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("calculateTotalCaloriesMethodReference = " + calculateTotalCaloriesMethodReference);

    }
}

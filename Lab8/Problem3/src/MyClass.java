import java.util.function.Predicate;

interface I1 {
    default void foo() {
        System.out.println("foo");
    }
}

interface I2 {
    void foo();
}

public class MyClass implements I1, I2 {


    public static void main(String[] args) {

    }

//    @Override
//    public void foo() {
//
//    }
}
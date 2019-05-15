package vallisneria.object_oriented_programming.chapter6.javasingleton;

public class ExampleClass {
    private static ExampleClass singleton = new ExampleClass();

    private ExampleClass() {
        System.out.println("객체가 생성됨");
    }

    static ExampleClass getInstance() {
        return singleton;
    }
}
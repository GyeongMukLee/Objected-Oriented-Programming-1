public class AbstractMain {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}

abstract class Animal {
    abstract public void sound();
}

final class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}

final class Cat extends Animal {
    public void sound() {
        System.out.println("야옹");
    }
}
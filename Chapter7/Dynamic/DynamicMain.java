public class DynamicMain {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;

        System.out.println(p.name);
        System.out.println(c.name);

        p.f();
        c.f();
    }
}

class Parent {
    String name = "A";

    public void f() {
        System.out.println("Parent.f()");
    }
}

class Child extends Parent {
    String name = "B";

    public void f() {
        System.out.println("Child.f()");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.Eat();
        c.Eat(); // Parent가 하는 것은 Child도 할 수 있다.

        c.Study();
        // p.Study(); // Child는 할 수 있지만 Parent는 할 수 없다.

        p.Walk();
        c.Walk();
    }
}
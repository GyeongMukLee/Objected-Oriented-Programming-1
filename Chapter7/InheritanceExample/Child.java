public class Child extends Parent {
    // Child 클래스는 접근제한자가 public인
    // Eat(), Walk()와 같은 메소드를 상속받았다.

    // Child 클래스는 Parent 클래스에는 없는
    // school과 grade 필드를 가질 수 있다.
    private String school;
    private int grede;

    // Child 클래스는 Parent 클래스에는 없는
    // doHomework(), Study() 메소드를 가질 수 있다.
    public void doHomework() {
        System.out.println("* HomeWork *");
    }

    public void Study() {
        System.out.println("* Study *");
    }

    // Parent에서 받은 메소드를 재정의할수 있다.
    @Override
    public void Walk() {
        System.out.println("* Slow Walk *");
    }
}
public class FirstOOP{
    public static void main(String[]args){
        Person p;

    }
}

class Person{
    private int age;
    private String name;

    public void setAge(int x){
        this.age=x;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String x){
        this.name=x;
    }
}
class Car {
    private int speed;
    private String color;
    private String model;

    // Car 클래스의 생성자
    public Car() {
        setColor("white");
    }

    public Car(String color) {
        setColor(color);
    }

    public void Run() {
        System.out.println("Running...");
    }

    public void Stop() {
        setSpeed(0);
        System.out.println("Parking...");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void upSpeed(int upvalue) {
        this.speed += upvalue;
    }

    public void downSpeed(int downvalue) {
        this.speed -= downvalue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
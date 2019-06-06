public interface PhoneInterface {
    int TIMEOUT = 10000; // final static 생략가능

    void send_call(); // public abstract 생략가능

    void receive_call();
}
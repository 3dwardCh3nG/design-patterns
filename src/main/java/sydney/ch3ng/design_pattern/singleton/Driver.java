package sydney.ch3ng.design_pattern.singleton;

public class Driver {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printId();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.printId();
    }
}

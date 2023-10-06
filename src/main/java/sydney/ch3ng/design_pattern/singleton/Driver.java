package sydney.ch3ng.design_pattern.singleton;

/**
 * The singleton design pattern is a creational design pattern that ensures that a class has only one instance while providing a global access point to this instance. The singleton pattern is often used when a single object is needed to coordinate actions across the system.
 */
public class Driver {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printId();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.printId();
    }
}

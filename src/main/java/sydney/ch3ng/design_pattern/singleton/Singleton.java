package sydney.ch3ng.design_pattern.singleton;

public class Singleton {
    private static Singleton instance;

    private long id;

    private Singleton() {
        id = System.currentTimeMillis();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public long getId() {
        return id;
    }

    public void printId() {
        System.out.println("Singleton id: " + id);
    }
}

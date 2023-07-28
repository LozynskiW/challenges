package pl.javabasics.theorytesting.patterns;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private String message;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    private Singleton() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

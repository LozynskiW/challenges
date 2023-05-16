package pl.javabasics.theorytesting.interfaces;

public interface ExampleInterface {

    public static final String name = "ExampleInterface";

    public abstract void abstractMethod();

    default String print() {
        return "default method";
    }

    int normalMethod(int num);

    public static String getInterfaceName() {
        return "static methods must contain body";
    };
}

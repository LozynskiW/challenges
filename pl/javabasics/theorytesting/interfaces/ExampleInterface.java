package pl.javabasics.theorytesting.interfaces;

public interface ExampleInterface {

    public static final String name = "ExampleInterface";

    public abstract void abstractMethod();

    int defaultMethod(int num);

    public static String getInterfaceName() {
        return "static methods must contain body";
    };
}

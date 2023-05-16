package pl.javabasics.theorytesting.interfaces;

public interface InheriringInterface extends ExampleInterface {

    @Override
    void abstractMethod();

    @Override
    default String print() {
        return "I deny what default method does";
    }

    @Override
    int normalMethod(int num);
}

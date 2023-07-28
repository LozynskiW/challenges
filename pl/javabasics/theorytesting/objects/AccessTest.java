package pl.javabasics.theorytesting.objects;

public class AccessTest {

    protected int protectedVariable;
    int defaultVariable;

    private void privateMethod() {

        System.out.println("private");
    }

    protected void protectedMethod() {

        System.out.println("protected");
    }

    void defaultMethod() {

        System.out.println("default");
    }
}

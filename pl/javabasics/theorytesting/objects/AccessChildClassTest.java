package pl.javabasics.theorytesting.objects;

public class AccessChildClassTest extends AccessTest{

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    protected void defaultMethod() {
        super.defaultMethod();
    }
}

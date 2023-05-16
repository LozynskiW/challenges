package pl.javabasics.theorytesting.anonymousclasses;

import pl.javabasics.theorytesting.abstractclass.ExampleAbstractClass;
import pl.javabasics.theorytesting.interfaces.ExampleInterface;

public class AnonymousClassTest {

    public static void main(String[] args) {

        ExampleInterface anonymousClass = new ExampleInterface() {

            //possible if java >= 16
//            public static String name = "ConstantString";
//
//            public static int getNum() {
//                return 0;
//            }

            @Override
            public void abstractMethod() {

            }

            @Override
            public int normalMethod(int num) {
                return 0;
            }
        };

        ExampleAbstractClass exampleAbstractClass = new ExampleAbstractClass(1, "test") {
            @Override
            protected void calculate(int a, int b) {

            }
        };
    }
}

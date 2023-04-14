package pl.javabasics.theorytesting.anonymousclasses;

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
            public int defaultMethod(int num) {
                return 0;
            }
        };
    }
}

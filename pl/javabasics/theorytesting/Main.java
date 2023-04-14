package pl.javabasics.theorytesting;

import pl.javabasics.theorytesting.abstractclass.ExampleAbstractClass;
import pl.javabasics.theorytesting.innerclass.OuterClass;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        ExampleAbstractClass test= new ExampleAbstractClass(1, "test") {
            @Override
            protected void calculate(int a, int b) {

            }
        };

        class localClassExample {

            private String str;
            public int num;

            public void print() {
                System.out.println("NOOOOO");
            }

            public static final boolean canIExist = true;
        }
    }
}

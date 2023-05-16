package pl.javabasics.theorytesting;

import pl.javabasics.theorytesting.abstractclass.ExampleAbstractClass;
import pl.javabasics.theorytesting.innerclass.OuterClass;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        ExampleAbstractClass test = new ExampleAbstractClass(1, "test") {
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

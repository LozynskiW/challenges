package pl.javabasics.theorytesting.innerclass;

import pl.javabasics.theorytesting.abstractclass.ExampleAbstractClass;

public class OuterClass {

    private int outerPrivateNum;
    private String outerPrivateString;

    static int staticInt;

    public void printClass() {

        InnerClass innerClass = new InnerClass();

        System.out.println(innerClass);
    }

    private void doNotShow() {
        System.out.println("secret");
    }

    public void anonymousClassExploit() {

        ExampleAbstractClass abstractClass = new ExampleAbstractClass(1, "test") {
            @Override
            protected void calculate(int a, int b) {
                System.out.println(OuterClass.staticInt);

                OuterClass outerClass = new OuterClass();
                System.out.println(outerClass.outerPrivateNum);
            }
        };

    }
    public class InnerClass {

        private String innerString;

        private void printClass() {

            OuterClass outerClass = new OuterClass();

            System.out.println(outerClass.outerPrivateString);

            outerClass.printClass();

            outerClass.doNotShow();
        }
    }
}

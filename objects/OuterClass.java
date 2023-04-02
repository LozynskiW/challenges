package objects;

public class OuterClass {

    private int outerNum;
    private String outerString;

    static int staticInt;

    public void printClass() {

        InnerClass innerClass = new InnerClass();

        System.out.println(innerClass);
    }
    private class InnerClass {

        private int innerNum;
        private String innerString;

        private void printClass() {

            OuterClass outerClass = new OuterClass();

            System.out.println();
        }
    }
}

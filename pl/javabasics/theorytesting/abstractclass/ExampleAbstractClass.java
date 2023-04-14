package pl.javabasics.theorytesting.abstractclass;

public abstract class ExampleAbstractClass {

    private int num;
    protected String name;

    public ExampleAbstractClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    protected abstract void calculate(int a, int b);

    public static void tester(int a, int b) {

    };

    public void show() {

        System.out.println(this.name);
    }
}

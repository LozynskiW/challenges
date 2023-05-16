package pl.javabasics.theorytesting.classes;

class BasicClass {

    private static int variableA;
    private final String name = "BasicClass";

    static class InnerClass {

    }

    public final String unmodifiableMethod() {

        return "No overriding";
    }

    public static String staticMethod(int in) {

        variableA = 5;

        return "Out: " + in + variableA;
    }

    String method(String s) {
        return "package private " + variableA + s;
    }

}

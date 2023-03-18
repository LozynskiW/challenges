package pl.javabasics;

public class RecursiveFactorial {

    public static int getFactorialOf(int n) {

        if (n == 1) return 1;

        return n*getFactorialOf(n-1);
    }

    public static void main(String[] args) {

        System.out.println(getFactorialOf(1));
        System.out.println(getFactorialOf(2));
        System.out.println(getFactorialOf(3));
        System.out.println(getFactorialOf(4));
        System.out.println(getFactorialOf(5));
        System.out.println(getFactorialOf(6));
    }
}

package pl.javabasics;

public class FibonacciSeries {

    public int calculateFibonacciForValue(int value) {

        if (value == 0) return 0;

        if (value == 1) return 1;

        return 100;
    }

    private static int recursiveAdd(int value) {

        if (value == 0) return 0;

        if (value == 1) return 1;

        return FibonacciSeries.recursiveAdd(value-1)+FibonacciSeries.recursiveAdd(value-2);
    }

    public static void main(String[] args) {

        System.out.println(FibonacciSeries.recursiveAdd(7));

    }
}

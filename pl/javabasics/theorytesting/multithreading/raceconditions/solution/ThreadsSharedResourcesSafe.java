package pl.javabasics.theorytesting.multithreading.raceconditions.solution;

public class ThreadsSharedResourcesSafe {

    private volatile long number = 0;

    public void add(long num) {
        this.number += num;
    }

    public long getNumber() {
        return number;
    }

    public void readValueFromResources() {

        try {
            Thread.sleep(1000);
            System.out.println("Number in resources: " + this.number);
        } catch (InterruptedException e) {
            System.out.println("Not this time");
        }
    }

}

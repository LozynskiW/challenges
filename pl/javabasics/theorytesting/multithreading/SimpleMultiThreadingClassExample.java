package pl.javabasics.theorytesting.multithreading;

class SimpleMultiThreadingClassExample implements Runnable{

    private int offset = 0;
    private final int threadNumber;

    public SimpleMultiThreadingClassExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void start() {

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println("Thread " + this.threadNumber + " running");

        while (this.offset < 10) {
            this.offset++;
            System.out.println("Thread " + this.threadNumber + ": "+this.offset);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }

    }


}

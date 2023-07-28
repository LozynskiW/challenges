package pl.javabasics.theorytesting.multithreading.raceconditions.example;

class ThreadRaceConditionsExample implements Runnable{

    //https://jenkov.com/tutorials/java-concurrency/race-conditions-and-critical-sections.html

    int count = 0;
    String name;

    ThreadsSharedResourcesUnsafe sharedResources;

    public ThreadRaceConditionsExample(String name, ThreadsSharedResourcesUnsafe sharedResources) {
        this.name = name;
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1_000_000; i++) {
            //System.out.print(" " + this.name + " reads resource value as: " + this.sharedResources.getNumber());
            this.sharedResources.add(1);
            //System.out.println(" " + this.name + " sets resource value as: " + this.sharedResources.getNumber());
        }

        try {
            Thread.sleep(1);
            System.out.println(" " + this.name + " outcome is: " + this.sharedResources.getNumber());
        } catch (InterruptedException e) {
            System.out.println("Not this time");
        }

    }

    public static void main(String[] args) {

        ThreadsSharedResourcesUnsafe threadsSharedResourcesUnsafe = new ThreadsSharedResourcesUnsafe();

        for (int i = 0; i < 4; i++) {

            Thread thread = new Thread(new ThreadRaceConditionsExample("Thread "+ i, threadsSharedResourcesUnsafe));
            thread.start();
        }
    }
}

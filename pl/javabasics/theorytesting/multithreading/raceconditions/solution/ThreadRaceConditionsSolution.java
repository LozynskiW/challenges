package pl.javabasics.theorytesting.multithreading.raceconditions.solution;

class ThreadRaceConditionsSolution implements Runnable {
    //UNSOLVED

    //https://jenkov.com/tutorials/java-concurrency/race-conditions-and-critical-sections.html

    String name;

    ThreadsSharedResourcesSafe sharedResources;

    public ThreadRaceConditionsSolution(String name, ThreadsSharedResourcesSafe sharedResources) {
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

        System.out.println(this.name + " outcome is: " + this.sharedResources.getNumber());

    }

    public static void main(String[] args) {

        ThreadsSharedResourcesSafe threadsSharedResourcesSafe = new ThreadsSharedResourcesSafe();

        for (int i = 0; i < 4; i++) {

            Thread thread = new Thread(new ThreadRaceConditionsSolution("Thread "+ i, threadsSharedResourcesSafe));
            thread.start();
        }

    }
}

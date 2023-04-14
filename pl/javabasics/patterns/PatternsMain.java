package pl.javabasics.patterns;

public class PatternsMain {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setMessage("singleton");
        System.out.println(singleton.getMessage());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getMessage());


    }
}

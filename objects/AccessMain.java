package objects;

public class AccessMain {

    public static void main(String[] args) {

        AccessTest accessTest = new AccessTest();

        System.out.println(accessTest.protectedVariable);
        System.out.println(accessTest.defaultVariable);
        accessTest.defaultMethod();
        accessTest.protectedMethod();

        float floatNum = 0.23f;

        long longNum = 100000000;

        double doubleNum = 20.8d;
        int intNum = 10;

        System.out.println(doubleNum/intNum);

        System.out.println(intNum/doubleNum);

        System.out.println(20.1/4);

        System.out.println((int) 10.61d);

    }
}

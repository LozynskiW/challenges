package objects;

public class AccessMain {

    public static void main(String[] args) {

        AccessTest accessTest = new AccessTest();

        System.out.println(accessTest.protectedVariable);
        System.out.println(accessTest.defaultVariable);
        accessTest.defaultMethod();
        accessTest.protectedMethod();

        float floatNum = 0.23f;

        int intNum = 10;

        long longNum = 100000000;

        double doubleNum = longNum;

    }
}

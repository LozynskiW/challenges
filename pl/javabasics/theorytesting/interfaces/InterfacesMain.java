package pl.javabasics.theorytesting.interfaces;

class InterfacesMain {

    public static void main(String[] args) {

        ExampleInterface exampleInterface = new ExampleInterface() {
            @Override
            public void abstractMethod() {

            }

            @Override
            public int normalMethod(int num) {
                return 0;
            }
        };

        ExampleInterface exampleInterfaceImplementation = new ImplementingClass();

    }
}

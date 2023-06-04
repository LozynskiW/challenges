package pl.javabasics.theorytesting.enums;

public class EnumsMain {

    public static void main(String[] args) {

        NamesEnum.GASGOINE.setHealth(3000);

        System.out.println(NamesEnum.GASGOINE.getHealth(10));

        System.out.println(NamesEnum.GHERMAN.getSentence());

        System.out.println(NamesEnum.GASGOINE.getSentence());

        NamesEnum.InnerClass innerClass = NamesEnum.GASGOINE.new InnerClass(1);

        innerClass.print();

        System.out.println(NamesEnum.InnerEnum.BEAST_FORM);

        NamesEnum.StaticClassInEnum staticClassInEnum = new NamesEnum.StaticClassInEnum();

        staticClassInEnum.print();

        System.out.println(NamesEnum.GHERMAN.toString());
        System.out.println(NamesEnum.LAURENCE.toString());
    }
}

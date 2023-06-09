package pl.javabasics.blackjack.utils;

public enum Number {

    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(10),
    Q(10),
    K(10);

    public final int value;

    private Number(int value) {

        this.value = value;
    }

}

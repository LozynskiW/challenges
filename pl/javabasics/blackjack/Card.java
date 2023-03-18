package pl.javabasics.blackjack;

import pl.javabasics.blackjack.utils.Symbol;
import pl.javabasics.blackjack.utils.Number;

public class Card {

    private final Symbol symbol;
    private final Number number;

    public Card(Symbol symbol, Number number) {
        this.symbol = symbol;
        this.number = number;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Number getNumber() {
        return number;
    }

    public int getCardValue(int cardsValue) {

        if (this.number == Number.ACE) {
            if (cardsValue + 11 > 21) return 1;
            else return 11;
        }

        return this.number.value;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

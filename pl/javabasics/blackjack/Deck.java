package pl.javabasics.blackjack;

import pl.javabasics.blackjack.utils.Number;
import pl.javabasics.blackjack.utils.Symbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final ArrayList<Card> cards = new ArrayList<>();
    private final Random random = new Random();

    public Deck() {

        for (Symbol symbol:Symbol.values()) {

            for (Number number: Number.values()) {

                cards.add(new Card(symbol, number));

            }

        }
        Collections.shuffle(cards);
    }

    public Card getCard() {

        int index = random.nextInt(cards.size());

        Card card = this.cards.get(index);

        this.cards.remove(card);

        return card;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Card card:this.cards) {

            stringBuilder.append(card.toString());
        }

        return "Deck{" + stringBuilder + '}';
    }
}

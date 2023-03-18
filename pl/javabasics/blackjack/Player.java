package pl.javabasics.blackjack;

import java.util.ArrayList;

public class Player {

    private final String nickname;
    private int money;
    private ArrayList<Card> hand;
    private int bet;

    public Player(String nickname, int money) {
        this.nickname = nickname;
        this.money = money;
        this.hand = new ArrayList<>();
        this.bet = 0;
    }

    public int getBet() {
        return bet;
    }

    public void clearBer() {
        this.bet = 0;
    }

    public void addToBet(int bet) {
        this.bet = this.bet+bet;
    }

    public String getNickname() {
        return nickname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void printPlayerInfo() {

        System.out.println();
        System.out.println(this.nickname);
        System.out.println("Total money: "+this.money);
        System.out.println("Total bet: "+this.bet);
    }

    public void printHand() {

        int num = 1;
        int value = 0;

        System.out.println();

        for (Card card:this.hand) {

            System.out.println("Card "+num+" |" + card.toString());

            value += card.getCardValue(value);
            num += 1;
        }
        System.out.println("---------------------");
        System.out.println("Value = "+ value);
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public void clearHand() {
        this.hand.clear();
    }
}

package pl.javabasics.blackjack;

public class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String passwordHash;
    private Player player;
    private int balance;

    public User(String name, String surname, String email, String passwordHash) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.passwordHash = passwordHash;
        this.balance = 10000;
        this.setPlayer(name+"."+surname, this.balance/10);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(String nickname, int money) {

        if (money > this.balance) {
            throw new RuntimeException("You need more money");
        }

        this.player = new Player(nickname, money);
    }

    public int getBalance() {
        return balance;
    }

    public void changeBalance(int balanceChange) {
        this.balance = this.balance + balanceChange;
    }
}

package pl.javabasics.blackjack;

import pl.javabasics.blackjack.utils.PlayerActions;

import java.util.*;

public class Game {

    private final HashSet users;
    private final Set<Player> players = new HashSet<>();
    private Set<Player> playersInGame = new HashSet<>();
    private Deck deck;
    private final Scanner scanner = new Scanner(System.in);

    public Game(User...users) {

        if (users.length < 2) {
            throw new RuntimeException("Need at least 2 players to start a game");
        }

        this.users = new HashSet(Arrays.asList(users));

        for (User user:users) {
            this.players.add(user.getPlayer());
        }
    }

    public void tossCards() {

        for (Player player:players) {
            player.addCardToHand(deck.getCard());
        }
    }

    private void restartGame() {

        for (Player player:players) {
            player.clearHand();
            this.playersInGame.add(player);
        }

        this.deck = new Deck();

    }

    public void printActions() {

        System.out.println();
        System.out.print("1.Hit");
        System.out.print(" 2.Stay");
        System.out.print(" 3.Double");
        System.out.println();
    }

    public void takeBets(){

    }

    public PlayerActions scanPlayerAction() {

        int playerAction = 0;

        System.out.print("Your decision [1/2/3]: ");

        try {
            playerAction = Integer.parseInt(scanner.next());
        }
        catch (NumberFormatException e) {
            System.out.println("You can only choose values 1 or 2 or 3");
            scanPlayerAction();
        }

        if (playerAction == 1) return PlayerActions.HIT;

        if (playerAction == 2) return PlayerActions.STAY;

        if (playerAction == 3) return PlayerActions.DOUBLE;

        this.scanPlayerAction();
        throw new RuntimeException("No such action");
    }

    public int makePlayerAction(Player player, PlayerActions playerAction) {

        if (playerAction == PlayerActions.HIT){

            player.addCardToHand(this.deck.getCard());
            return 1;
        }
        else if (playerAction == PlayerActions.STAY){

            System.out.println();
            return 0;
        }
        else if (playerAction == PlayerActions.DOUBLE){

            if (player.getMoney() >= player.getBet()) {

                player.addToBet(player.getBet());
                player.addCardToHand(this.deck.getCard());
                return 0;
            } else {
                System.out.println("You don't have enough money");
                this.makePlayerAction(player, this.scanPlayerAction());
            }
        }

        return 1;

    }

    public void start() {

        this.restartGame();

        this.tossCards();
        this.tossCards();

        while (this.playersInGame.size() > 1) {

            for (Player player:this.playersInGame) {

                System.out.println();
                System.out.println("#####################");

                player.printPlayerInfo();
                player.printHand();

                this.printActions();
                this.makePlayerAction(player, this.scanPlayerAction());

                System.out.println();

            }

        }

    }

    public static void main(String[] args) {

        User user1 = new User("Jim", "Lahey", "j.lahey@sunnyvale.ca", "dasdas");
        User user2 = new User("Ricky", "Lahey", "r.lahey@sunnyvale.ca", "gfdsfas");

        Game blackJackGame = new Game(user1, user2);
        blackJackGame.start();
    }
}

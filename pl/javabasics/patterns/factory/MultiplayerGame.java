package pl.javabasics.patterns.factory;

public class MultiplayerGame implements Game{

    private String name;
    private int numberOfPlayers;
    private boolean isGood;

    public MultiplayerGame(String name, int numberOfPlayers, boolean isGood) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.isGood = isGood;
    }

    public MultiplayerGame() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    @Override
    public boolean isGood() {
        return this.isGood;
    }

    @Override
    public String toString() {
        return "MultiplayerGame{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", isGood=" + isGood +
                '}';
    }
}

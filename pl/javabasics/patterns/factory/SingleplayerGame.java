package pl.javabasics.patterns.factory;

public class SingleplayerGame implements Game{
    private String name;
    private boolean isGood;

    public SingleplayerGame(String name, boolean isGood) {
        this.name = name;
        this.isGood = isGood;
    }

    public SingleplayerGame() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getNumberOfPlayers() {
        return 1;
    }

    @Override
    public boolean isGood() {
        return this.isGood;
    }
}

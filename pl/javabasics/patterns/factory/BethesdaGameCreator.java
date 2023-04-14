package pl.javabasics.patterns.factory;

public class BethesdaGameCreator implements GameFactory{
    @Override
    public Game crate() {
        return new SingleplayerGame("The Elder...", true);
    }
}

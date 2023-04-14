package pl.javabasics.patterns.factory;

public class ActivisionGameCreator implements GameFactory {
    @Override
    public Game crate() {
        return new MultiplayerGame("CoD", 16, false);
    }
}

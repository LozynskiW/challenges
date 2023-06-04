package pl.javabasics.patterns.factory;
class GameFactory {

    public Game crate(String gameType) {

        if (gameType == "single") {
            return new SingleplayerGame();
        } else if (gameType == "multiplayer") {
            return new MultiplayerGame();
        }

        return null;
    }

}

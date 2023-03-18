package pl.javabasics.blackjack.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PlayerActions {
    HIT(1),
    STAY(2),
    DOUBLE(3);

    private final int actionNumber;

    private PlayerActions(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public int getActionNumber() {
        return actionNumber;
    }

}

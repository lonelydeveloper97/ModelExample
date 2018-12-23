package com.lonelydeveloper97.model.example;

import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.impl.AbstactSystem;

import java.util.Arrays;
import java.util.Random;

public class Coin extends AbstactSystem {
    private State<CoinSide> currentState;

    public Coin() {
        super(Arrays.asList(CoinSide.EDGE, CoinSide.HEAD, CoinSide.TAIL));
    }

    public void throwCoin() {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        if (x < 2) {
            currentState = (State<CoinSide>) possibleStates().get(0);
        } else if (x < 51) {
            currentState = (State<CoinSide>) possibleStates().get(1);
        } else {
            currentState = (State<CoinSide>) possibleStates().get(2);
        }
    }

    @Override
    public State<CoinSide> currentState() {
        return currentState;
    }
}

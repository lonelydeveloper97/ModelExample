package com.lonelydeveloper97.model.example;

import com.lonelydeveloper97.model.Action;
import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.impl.AbstactSystem;
import com.lonelydeveloper97.model.impl.AtomicAction;

import java.util.Arrays;
import java.util.Random;

public class Coin extends AbstactSystem {
    private State<CoinSide> currentState;

    public Coin() {
        super(Arrays.asList(CoinSide.EDGE, CoinSide.HEAD, CoinSide.TAIL));
        currentState = (State<CoinSide>) possibleStates().get(0);
    }

    public Action throwCoin() {
        return new AtomicAction() {
            @Override
            public void perform() {
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
        };
    }

    @Override
    public State<CoinSide> currentState() {
        return currentState;
    }
}

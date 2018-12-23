package com.lonelydeveloper97.model.example;

import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.impl.AbstactSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoCoinsSystem  extends AbstactSystem<Coin> {
    public TwoCoinsSystem() {
        super(Arrays.asList(new Coin(), new Coin()));
    }

    public void rethrowAll(){
        for(Coin coin: getSubsystems()){
            coin.throwCoin();
        }
    }

    @Override
    public State<List<CoinSide>> currentState() {
        List<CoinSide> states = new ArrayList<>();
        for(Coin system: getSubsystems()){
            states.add(system.currentState().state());
        }
        return () -> states;
    }
}

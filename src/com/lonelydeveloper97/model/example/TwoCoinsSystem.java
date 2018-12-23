package com.lonelydeveloper97.model.example;

import com.lonelydeveloper97.model.Action;
import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.impl.AbstactSystem;
import com.lonelydeveloper97.model.impl.ComplexAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoCoinsSystem  extends AbstactSystem<Coin> {
    public TwoCoinsSystem() {
        super(Arrays.asList(new Coin(), new Coin()));
    }

    public Action rethrowAllAction(){
        List<Action> innerActions = new ArrayList<>();
        for(Coin coin: getSubsystems()){
            innerActions.add(coin.throwCoin());
        }
        return new ComplexAction(innerActions);
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

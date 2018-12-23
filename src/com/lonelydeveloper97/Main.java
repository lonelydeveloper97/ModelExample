package com.lonelydeveloper97;

import com.lonelydeveloper97.model.Action;
import com.lonelydeveloper97.model.example.TwoCoinsSystem;
import com.lonelydeveloper97.model.impl.ComplexAction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TwoCoinsSystem twoCoinsSystem = new TwoCoinsSystem();

        Action rethrow300Times = rethrowTwoCoinsNTimes(twoCoinsSystem, 300);
        rethrow300Times.perform();
        System.out.println("Complexity of 300 rethrows: " + rethrow300Times.complexity());

    }

    private static Action rethrowTwoCoinsNTimes(TwoCoinsSystem twoCoinsSystem, int times) {
        List<Action> subActions = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            int finalI = i;
            Action action = twoCoinsSystem.rethrowAllAction();
            subActions.add(new Action() {
                @Override
                public void perform() {
                    System.out.println("Throw number: " + finalI);
                    action.perform();
                    twoCoinsSystem.currentState().state().forEach(System.out::println);
                    System.out.println();
                }

                @Override
                public int complexity() {
                    return action.complexity();
                }
            });
        }
        return new ComplexAction(subActions);
    }
}

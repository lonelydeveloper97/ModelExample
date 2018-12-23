package com.lonelydeveloper97.model.impl;

import com.lonelydeveloper97.model.Action;

import java.util.List;

public class ComplexAction implements Action {
    private List<Action> actionList;

    public ComplexAction(List<Action> actionList) {
        this.actionList = actionList;
    }


    @Override
    public void perform() {
        for (Action action : actionList) {
            action.perform();
        }
    }

    @Override
    public int complexity() {
        int sumComplexity = 0;
        for (Action action : actionList) {
            sumComplexity += action.complexity();
        }
        return sumComplexity;
    }
}

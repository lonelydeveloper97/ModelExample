package com.lonelydeveloper97.model.impl;

import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.System;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Element<T extends Element> implements System {

    @Override
    public List<State> possibleStates() {
        return Collections.singletonList(currentState());
    }

    @Override
    public State<T> currentState() {
        return () -> (T) Element.this;
    }
}

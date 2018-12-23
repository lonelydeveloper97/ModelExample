package com.lonelydeveloper97.model;

import java.util.List;
import java.util.Set;

public interface System {
    List<State> possibleStates();

    State currentState();
}

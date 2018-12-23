package com.lonelydeveloper97.model.impl;

import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.System;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstactSystem<S extends System> implements System {
    private final List<S> subsystems;

    public AbstactSystem(List<S> subsystems) {
        this.subsystems = subsystems;
    }

    protected List<S> getSubsystems() {
        return subsystems;
    }

    @Override
    public List<State> possibleStates() {
        List<State> states = new ArrayList<>();
        for (System system : subsystems) {
            states.addAll(system.possibleStates());
        }

        return states;
    }
}

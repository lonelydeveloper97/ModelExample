package com.lonelydeveloper97.model.impl;

import com.lonelydeveloper97.model.Action;

public abstract class AtomicAction implements Action {
    @Override
    public int complexity() {
        return 1;
    }
}

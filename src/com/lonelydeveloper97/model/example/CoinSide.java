package com.lonelydeveloper97.model.example;

import com.lonelydeveloper97.model.impl.Element;

public abstract class CoinSide extends Element<CoinSide> {
    private final String name;

    public CoinSide(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public final static CoinSide EDGE = new CoinSide("edge") {
    };
    public final static CoinSide HEAD = new CoinSide("head") {
    };
    public final static CoinSide TAIL = new CoinSide("tail") {
    };
}

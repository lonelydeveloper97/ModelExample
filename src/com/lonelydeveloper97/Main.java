package com.lonelydeveloper97;

import com.lonelydeveloper97.model.State;
import com.lonelydeveloper97.model.example.TwoCoinsSystem;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TwoCoinsSystem twoCoinsSystem = new TwoCoinsSystem();

        for (int i = 0; i < 300; i++) {
            System.out.println("Try number: " + i);
            twoCoinsSystem.rethrowAll();
            twoCoinsSystem.currentState().state().forEach(s -> System.out.println(s.getName()));
            System.out.println();
        }
    }
}

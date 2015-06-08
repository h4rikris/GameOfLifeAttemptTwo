package com.tw.pathasala;

public class Cell {
    private boolean state = true;

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean isAlive() {
        return state;
    }

    public void toggle() {
        state = state ? false : true;
    }
}

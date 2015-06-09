package com.tw.pathasala;

import java.util.ArrayList;

public class Grid {
    private ArrayList<ArrayList<Cell>> grid = new ArrayList<ArrayList<Cell>>();

    public Integer findAliveNeighbours(int x, int y) {
        int count = 0;
        if (inBoundary(x - 1, y - 1)) {
            count = grid.get(x - 1).get(y - 1).isAlive() ? count + 1 : count;
        }
        return count;
    }

    private boolean inBoundary(int x, int y) {
        if (!(x >= 0 && x < grid.size())) return false;
        if (!(y >= 0 && y < grid.size())) return false;
        return true;
    }
}

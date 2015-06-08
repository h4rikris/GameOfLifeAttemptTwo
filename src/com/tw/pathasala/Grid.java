package com.tw.pathasala;

import java.util.ArrayList;

public class Grid {
    private ArrayList<ArrayList<Cell>> grid = new ArrayList<ArrayList<Cell>>();

    public Integer findAliveNeighbours(int x, int y) {
        int count = 0;
        if ((x == 0 && y==0) || (x==0 && y==grid.get(0).size()-1) || (x==grid.size()-1 && y==0) ||
                (x==grid.size()-1 && y==grid.get(grid.size()-1).size()-1)){

        }
        return count;
    }
}

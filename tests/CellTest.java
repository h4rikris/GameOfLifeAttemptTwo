import com.tw.pathasala.Cell;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void testForCellIsAlive() {
        Cell cell = new Cell(true);

        boolean cellstate = cell.isAlive();

        assertEquals(true, cellstate);
    }

    @Test
    public void testForCellIsDead() {
        Cell cell = new Cell(false);

        boolean deadcell = cell.isAlive();

        assertEquals(false, deadcell);
    }

    @Test
    public void testForCellStateToggleFromLiveToDead() {
        Cell cell = new Cell(true);

        cell.toggle();
        boolean cellstate = cell.isAlive();

        assertEquals(false, cellstate);
    }

    @Test
    public void testForCellStateToggleFromDeadToAlive() {
        Cell cell = new Cell(false);

        cell.toggle();
        boolean cellstate = cell.isAlive();

        assertEquals(true, cellstate);
    }
}

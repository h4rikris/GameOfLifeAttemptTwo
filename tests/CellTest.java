import com.tw.pathasala.Cell;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void testForCellIsAlive(){
        Cell cell = new Cell(true);

        boolean cellstate = cell.isAlive();

        assertEquals(true, cellstate);
    }

    @Test
    public void testForCellIsDead() {
        Cell cell = new Cell(false);

        boolean cellstate = cell.isAlive();

        assertEquals(false, cellstate);
    }
}

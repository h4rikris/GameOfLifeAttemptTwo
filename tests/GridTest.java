import com.tw.pathasala.Grid;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GridTest {

    @Test
    public void testForGridFindingNeighbours(){
        Grid grid = new Grid();

        int noOfNeighbours = grid.findAliveNeighbours(0, 0);

        assertEquals(0, noOfNeighbours);
    }
}

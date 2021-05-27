import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ObjectInsertionSorterTest {

    @Test
    void objectInsertionSorter() {
        String[] values1 = { "Zeb", "Deb", "Will", "Karen",
                "Aaron", "Chris", "Barb", "Kenny" };
        String[] values2 = { "Zeb", "Deb", "Will", "Karen",
                "Aaron", "Chris", "Barb", "Kenny" };
        ObjectInsertionSorter objectInsertionSorter = new ObjectInsertionSorter();
        objectInsertionSorter.objectInsertionSorter(values1);
        Arrays.sort(values2);
        Assertions.assertArrayEquals(values2,values1);
    }
}
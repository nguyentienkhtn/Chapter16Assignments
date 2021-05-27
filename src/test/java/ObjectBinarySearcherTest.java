import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectBinarySearcherTest {

    @Test
    void search1() {
        String[] sts = {"123", "456", "789"};
        ObjectBinarySearcher objectBinarySearcher =
                new ObjectBinarySearcher();
        Assertions.assertEquals(0, objectBinarySearcher.search(sts, "123"));
    }
    @Test
    void search2() {
        String[] sts = {"123", "456", "789"};
        ObjectBinarySearcher objectBinarySearcher =
                new ObjectBinarySearcher();
        Assertions.assertEquals(-1, objectBinarySearcher.search(sts, "111"));
    }
    @Test
    void search3() {
        String[] sts = {"123", "456", "789"};
        ObjectBinarySearcher objectBinarySearcher =
                new ObjectBinarySearcher();
        Assertions.assertEquals(2, objectBinarySearcher.search(sts, "789"));
    }
}
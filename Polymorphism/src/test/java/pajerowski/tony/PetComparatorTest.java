package pajerowski.tony;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/5/17.
 */
public class PetComparatorTest {
    PetComparator comparator;

    @Before
    public void setup() {
        comparator = new PetComparator();
    }

    @Test
    public void compareTest() {
        Pet expected = new Cat("Fluffy");
        Pet actual = new Cat("StinkyOne");
        assertTrue(0 > comparator.compare(expected, actual));
    }
}

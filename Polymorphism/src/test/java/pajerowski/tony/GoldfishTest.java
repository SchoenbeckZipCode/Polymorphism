package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class GoldfishTest {
    Goldfish fishy;

    @Before
    public void setup() {
        fishy = new Goldfish();
    }

    @Test
    public void speak() {
        String expected = "glub glub glub!";
        String actual = fishy.speak();
        Assert.assertEquals(expected,actual);
    }
}
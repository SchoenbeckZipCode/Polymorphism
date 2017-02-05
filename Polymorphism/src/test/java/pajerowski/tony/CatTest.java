package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class CatTest {
    Cat cat;

    @Before
    public void setup() {
        cat = new Cat();
    }

    @Test
    public void speak() {
        String expected = "ooh Meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
}

package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public class CatTest {
    Pet cat;

    @Before
    public void setup() {
        cat = new Cat();
    }

    @Test
    public void speakTest() {
        String expected = "ooh meow!";
        String actual = cat.speak();
        assertEquals(expected, actual);
    }
}
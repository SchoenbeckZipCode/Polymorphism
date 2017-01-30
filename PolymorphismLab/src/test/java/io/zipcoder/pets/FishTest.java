package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public class FishTest {
    Pet fish;

    @Before
    public void setup() {
        fish = new Fish();
    }

    @Test
    public void speakTest() {
        String expected = "glub glub glub!";
        String actual = fish.speak();
        assertEquals(expected, actual);
    }
}
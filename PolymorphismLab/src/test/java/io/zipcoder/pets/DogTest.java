package io.zipcoder.pets;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public class DogTest {
    Pet dog;

    @Before
    public void setup() {
        dog = new Dog();
    }

    @Test
    public void speakTest() {
        String expected = "bark bark bark!";
        String actual = dog.speak();
        assertEquals(expected, actual);
    }
}
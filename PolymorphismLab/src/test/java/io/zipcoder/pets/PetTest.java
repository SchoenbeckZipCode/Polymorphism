package io.zipcoder.pets;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public class PetTest
{
    Pet dog;

    @Before
    public void setup(){
        dog = new Dog();
        dog.setName("Woofy");
    }
    @Test
    public void getNameTest() {
        String expected = "Woofy";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Barkly";
        dog.setName("Barkly");
        String actual = dog.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void toStringTest() {
        String expected = "Hi, my name is: Woofy. 'bark bark bark'";
        String actual = dog.toString();
        assertEquals(expected, actual);
       }
}
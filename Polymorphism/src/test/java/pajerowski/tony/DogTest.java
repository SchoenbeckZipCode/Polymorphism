package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class DogTest {
    Dog dog;

    @Before
    public void setup() {
        dog = new Dog();
    }

    @Test
    public void speak() {
        String expected = "bark bark bark bark bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
}

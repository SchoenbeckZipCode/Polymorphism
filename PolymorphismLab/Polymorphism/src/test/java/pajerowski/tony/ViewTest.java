package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class ViewTest {
    View view;

    @Before
    public void setup() {
        view = new View();
    }


    @Test
    public void promptUserForNumberOfPetsTest(){
        Integer expected = 1;
        Integer actual = view.promptUserForNumberOfPets();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void promptUserForTypeOfPetTest(){
        String expected = "Dog";
        String actual = view.promptUserForTypeOfPet();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void promtUserForNameOfPetTest(){
        String expected = "Old Betsy";
        String actual = view.promptUserForNameOfPet();
        Assert.assertEquals(expected,actual);
    }


}

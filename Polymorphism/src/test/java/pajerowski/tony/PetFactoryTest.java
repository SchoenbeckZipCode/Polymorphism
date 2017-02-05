package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class PetFactoryTest {
    PetFactory factory;

    @Before
    public void setup() {
       factory = new PetFactory();
    }

    @Test
    public void makePetsTest() {
        Class expected = new Dog().getClass();
        Class actual = factory.makePets("Old Betsy", "Dog").getClass();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makePetsCatTest() {
        Class expected = new Cat().getClass();
        Class actual = factory.makePets("kitty", "CAT").getClass();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makePetsGoldfishTest() {
        Class expected = new Goldfish().getClass();
        Class actual = factory.makePets("fishyfishy", "goldfisH").getClass();
        Assert.assertEquals(expected,actual);
    }
}


//
//public class PetFactory {
//
//    public Pet makePets(String name, String type){
//        Pet pet = null;
//        switch (type.toLowerCase()) {
//            case "dog":
//                pet = new Dog(name);
//                break;
//            case "cat":
//                pet = new Cat(name);
//                break;
//            case "goldfish":
//                pet = new Goldfish(name);
//                break;
//            default:
//                break;
//        }
//        return pet;
//    }

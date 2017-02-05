package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class PetFactory {

    public Pet makePets(String name, String type){
        Pet pet = null;
        switch (type.toLowerCase()) {
            case "dog":
                pet = new Dog(name);
                break;
            case "cat":
                pet = new Cat(name);
                break;
            case "goldfish":
                pet = new Goldfish(name);
                break;
            default:
                System.out.println("That is not an allowable pet type.");
                break;
        }
        return pet;
    }

}

package pajerowski.tony;

import java.util.List;
import java.util.Scanner;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class Controller {
    public static Scanner scanner = new Scanner(System.in);
    private PetCollection petCollection = new PetCollection();
    private PetFactory petFactory = new PetFactory();
    public View view = new View();

    public void buildCollectionOfPets(){
        int numberOfPets = view.promptUserForNumberOfPets();
        for ( int i = 0; i < numberOfPets; i++) {
            petCollection.pets.add(petFactory.makePets(view.promptUserForNameOfPet(), view.promptUserForTypeOfPet()));
        }
    }

    public void makePetsSpeak() {
        String output = "";
        for ( int i = 0; i < petCollection.pets.size(); i++){
            output += petCollection.pets.get(i).getName() + " says " + petCollection.pets.get(i).speak() + " \n";
        }
        view.displayToScreen(output);
    }


}

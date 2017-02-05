package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class OpenPetShop {
    static Controller controller = new Controller();
    public static void main(String[] args) {
        controller.buildCollectionOfPets();
        controller.makePetsSpeak();
    }
}
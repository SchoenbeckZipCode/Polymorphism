package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class View {

    public int promptUserForNumberOfPets() {
        System.out.println("Please enter the number of pets you have: ");
        return Controller.scanner.nextInt();
    }

    public String promptUserForNameOfPet() {
        System.out.println("Enter the name of your pet: ");
        return Controller.scanner.next();
    }

    public String promptUserForTypeOfPet() {
        System.out.println("Enter the type of your pet: ");
        return Controller.scanner.next();
    }

    public void displayToScreen(String output) {
        System.out.println(output);
    }
}

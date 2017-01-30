package io.zipcoder.pets;

/**
 * Created by anthonypajerowski on 1/30/17.
 */
public class RunProgram {
    static UserPetInformation pet = new UserPetInformation();

    public static void main(String[] args) {
        pet.askAboutUsersPets();
        pet.listPets();
    }

}
